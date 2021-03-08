package cn.biuaxia.data.migration.generate;

import cn.biuaxia.data.migration.generate.msq.domain.KmImissiveSendMain;
import cn.biuaxia.data.migration.generate.msq.service.KmImissiveSendMainService;
import cn.biuaxia.data.migration.generate.orcl.domain.MvFormsetInst;
import cn.biuaxia.data.migration.generate.orcl.service.MvFormsetInstService;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@SpringBootTest
public class DocTransferTests {

    @Autowired
    private MvFormsetInstService mvFormsetInstService;

    @Autowired
    private KmImissiveSendMainService kmImissiveSendMainService;

    final String[] SEND_FORM_NAME = new String[]{
            // 厅发文
            "厅发文", "联合发文", "专报",
            // 其他
            "签报", ""
            // IT运维
    };

    /**
     * 预期数据总数
     */
    private int totalExpectedData = 0;

    /**
     * 数据导入
     */
    @Test
    void entry() {
        docMain();
    }

    /**
     * 公文主数据
     */
    private void docMain() {
        HashSet<MvFormsetInst> allOriginDataList = getAllOriginDataList();
        log.info("totalExpectedData: [{}]", totalExpectedData);
        log.info("totalFinalData: [{}]", allOriginDataList.size());
        boolean flag = totalExpectedData == allOriginDataList.size();
        log.info("compareDataSize: [{}]", flag);
        if (flag) {
            // 按照 流程模板进行拆分
            List<String> folderNameList = CollUtil.getFieldValues(allOriginDataList, "folderName", String.class);
            log.info("folderNameList: [{}]", JSONUtil.toJsonPrettyStr(CollUtil.newHashSet(folderNameList)));

            Map<Object, Object> asMap = CollUtil.fieldValueAsMap(allOriginDataList, "folderId", "folderName");
            log.info("asMap: [{}]", JSONUtil.toJsonPrettyStr(asMap));

            // 输出目标分类列表
            final List<String> outCategory = Arrays.asList("发文", "收文", "签报");

            // 分析是否包含目标分类
            AtomicInteger postCategory = new AtomicInteger();
            AtomicInteger receivedCategory = new AtomicInteger();
            AtomicInteger signedReportCategory = new AtomicInteger();
            AtomicInteger notHasCategory = new AtomicInteger();
            allOriginDataList.forEach(item -> {
                if ("发文".equals(item.getFolderName())) {
                    postCategory.getAndIncrement();
                } else if ("收文".equals(item.getFolderName())) {
                    receivedCategory.getAndIncrement();
                } else if ("签报".equals(item.getFolderName())) {
                    signedReportCategory.getAndIncrement();
                } else {
                    notHasCategory.getAndIncrement();
                }
            });

            int tempCount =
                    notHasCategory.get() + postCategory.get() + receivedCategory.get() + signedReportCategory.get();
            flag = totalExpectedData == tempCount;
            log.info("equals: [{}], postCategory: [{}], receivedCategory: [{}], signedReportCategory: [{}], " +
                             "notHasCategory: [{}]",
                     flag,
                     postCategory,
                     receivedCategory,
                     signedReportCategory,
                     notHasCategory);

            // 构建 MySQL 数据
            if (flag) {
                ArrayList<Object> outList = CollUtil.newArrayList();
                allOriginDataList.forEach(item -> {
                    outList.add(KmImissiveSendMain.build(item));
                });
                log.info("equals: [{}], [{}]", totalExpectedData == outList.size(),
                         JSONUtil.toJsonPrettyStr(outList.get(0)));
            }
        }
    }

    /**
     * 1. 获取所有原数据列表
     */
    HashSet<MvFormsetInst> getAllOriginDataList() {
        HashSet<MvFormsetInst> hashSet = CollUtil.newHashSet();
        // 总数
        totalExpectedData = mvFormsetInstService.count();
        // 分页条数
        final int size = 10000;
        // 循环条件
        int i1 = totalExpectedData / size + 1;
        // i1 = 2;
        for (int i = 1; i <= i1; i++) {
            Page<MvFormsetInst> page = new Page<>(i, size, totalExpectedData);
            // 按照时间倒序
            Page<MvFormsetInst> instPage = mvFormsetInstService
                    .page(page,
                          Wrappers.<MvFormsetInst>lambdaQuery()
                                  .orderByDesc(MvFormsetInst::getCreateTime));
            // 结果集
            List<MvFormsetInst> records = instPage.getRecords();
            log.info("[{}, {}] -> [{}]: [{}, {}]",
                     instPage.getCurrent(),
                     instPage.getPages(),
                     records.size(),
                     records.get(0).getFormsetInstId(),
                     records.get(records.size() - 1).getFormsetInstId());
            hashSet.addAll(records);
        }
        return hashSet;
    }

    final Map<Long, String> map = new HashMap<>();

    /**
     * 获取Oracle公文数据
     */
    void getOracleList() {
        // 公文总数
        int count = mvFormsetInstService.count();
        log.info("总条数: [{}]", count);
        // 分页条数
        final int size = 10000;
        // 循环条件
        int i1 = count / size + 1;
        // i1 = 2;
        for (int i = 1; i <= i1; i++) {
            Page<MvFormsetInst> page = new Page<>(i, size, count);
            // 按照时间倒序
            Page<MvFormsetInst> instPage = mvFormsetInstService
                    .page(page,
                          Wrappers.<MvFormsetInst>lambdaQuery()
                                  .orderByDesc(MvFormsetInst::getCreateTime));
            // 结果集
            List<MvFormsetInst> records = instPage.getRecords();
            log.info("[{}, {}] -> [{}]: [{}, {}]",
                     instPage.getCurrent(),
                     instPage.getPages(),
                     records.size(),
                     records.get(0).getFormsetInstId(),
                     records.get(records.size() - 1).getFormsetInstId());
            transferOracle2Mysql(records);
        }
    }

    /**
     * 转换Oracle公文正文数据为Mysql
     */
    void transferOracle2Mysql(List<MvFormsetInst> m) {
        for (MvFormsetInst mvFormsetInst : m) {
            map.put(mvFormsetInst.getFolderId(), mvFormsetInst.getFolderName());
        }
    }

    private HashSet<String> docCategorySet = new HashSet<>();
    private HashSet<String> docInstIdSet = new HashSet<>();

    @Test
    void transfer() {
        getOracleList();
        log.info("map: [{}]", JSONUtil.toJsonPrettyStr(map));
        // 分类-Excel数据生产
        ArrayList<Map<Long, String>> rows = CollUtil.newArrayList(map);
        //通过工具类创建writer
        ExcelWriter writer = ExcelUtil.getWriter("d:/formsetInstFolder.xlsx");
        // 一次性写出内容，使用默认样式，强制输出标题
        writer.write(rows, true);
        // 关闭writer，释放内存
        writer.close();
    }

    @Test
    void getAllSendCategory() {
        int pages = getPages();
        log.info("总页数: [{}]", pages);
        for (int i = 2; i <= pages; i++) {
            // 开始循环获取
            String body = getBody(i);
            log.info("当前页: [{}]", i);
        }
        log.info("docCategorySet: [{}]", docCategorySet);
        log.info("docInstIdSet: [{}]", docInstIdSet);
    }

    private int getPages() {
        String body = getBody(1);
        // log.info("body: [{}]", body);

        // 总页数
        final String pagesReg = "<td class=\"pageBarInfo\">共(\\d+)页(\\d+)条记录</td>";
        Integer pages = Integer.valueOf(ReUtil.getGroup1(pagesReg, body));
        // log.info("pages: [{}]", pages);
        Integer allTotal = Integer.valueOf(ReUtil.get(pagesReg, body, 2));
        // log.info("allTotal: [{}]", allTotal);

        // 当前页
        final String currentPageReg = "<td><input id=\"currPage\" size=\"\\d+\" value=\"(\\d+)\"></td>";
        Integer currentPage = Integer.valueOf(ReUtil.getGroup1(currentPageReg, body));
        // log.info("currentPage: [{}]", currentPage);

        return pages;
    }

    private String getBody(int currentPage) {
        final String URL = "http://172.16.0.81/missive/newDocQueryServer.do?method=configQueryGov";
        String body = HttpRequest.post(URL)
                // .contentType(ContentType.FORM_URLENCODED.toString())
                .cookie("PORTALSESSIONID=ThnGg1npjLHxXk9NfCHrJjGLCMQyPvqyTh04rslmgDtRlVxtC1Pv" +
                                "!1873843055" +
                                "!1614147198381; USER_INFO=c2NqdHRjZXNoaQ==; " +
                                "username=\"scjttceshi@null\"; " +
                                "ThemeStylePath=styles/style1; CurrentSiteId=1001; " +
                                "JSESSIONID=LV97g10H2kcWJvHJJGj7Vdbvpxzr2qPpsrRJnqfBRmlcWHBKLJ19" +
                                "!-410986968; " +
                                "sentWorkItemList=")
                .form("page", currentPage)
                .form("listType", 6)
                .execute()
                .body();

        final String docCategoryReg =
                "value=\"(\\d+)\"[^<]+</td>[^<]+<td[^t]+title=\"[^\"]+\">[^<]+</td>[^<]+<td[^a]+align" +
                        "=\"[^\"]+\"[^>]+>([^<]+)</td>";
        List<String> allDocInstIdStr = ReUtil.findAll(docCategoryReg, body, 1);
        List<String> allCategoryStr = ReUtil.findAll(docCategoryReg, body, 2);
        // log.info("匹配结果: [{}]", allCategoryStr);
        docInstIdSet.addAll(allDocInstIdStr);
        docCategorySet.addAll(allCategoryStr);

        return body;
    }

    private final List<Long> INST_IDS = Arrays.asList(
            951625L, 996658L, 949666L, 951623L, 953922L, 953921L, 948219L, 948451L, 948691L, 949662L, 984545L,
            981398L, 982004L, 961786L, 969390L, 1007052L, 994587L, 959113L, 949537L, 950547L, 947477L, 951755L,
            951756L, 950543L, 972679L, 949539L, 1001981L, 982482L, 985994L, 1000777L, 960232L, 947476L, 983445L,
            986956L, 982236L, 959008L, 979194L, 979193L, 979196L, 979195L, 959484L, 964709L, 959123L, 951968L,
            950878L, 995347L, 972543L, 948116L, 972428L, 972426L, 972427L, 973519L, 986951L, 949564L, 960312L,
            958006L, 958009L, 986949L, 958008L, 955093L, 958241L, 958240L, 951970L, 970130L, 957154L, 958003L,
            957155L, 971583L, 995115L, 975803L, 948107L, 995358L, 950888L, 999713L, 975806L, 1002970L, 969384L,
            969383L, 1001767L, 960331L, 953919L, 948222L, 958016L, 959225L, 981489L, 962500L, 960208L, 951620L,
            958010L, 957283L, 958130L, 958011L, 972660L, 958014L, 958013L, 996853L, 972369L, 971039L, 953848L,
            997944L, 948379L, 951788L, 951789L, 951786L, 951302L, 951787L, 949588L, 960023L, 949587L, 984235L,
            1006282L, 1007377L, 960019L, 950465L, 1006284L, 1006283L, 951790L, 952404L, 950225L, 950226L, 1000738L,
            962211L, 961364L, 949330L, 949213L, 960032L, 1005182L, 966923L, 1006279L, 958195L, 959041L, 974300L,
            972243L, 969179L, 969175L, 957191L, 957192L, 950677L, 963630L, 961572L, 982273L, 960485L, 1000769L,
            959016L, 980097L, 960598L, 950440L, 969290L, 959132L, 959131L, 959497L, 959134L, 959133L, 994005L,
            959499L, 996522L, 972232L, 950448L, 949118L, 983232L, 982387L, 960125L, 979095L, 962302L, 980082L,
            980081L, 968093L, 958173L, 951784L, 973554L, 959023L, 1007382L, 1001115L, 976409L, 1002200L, 964545L,
            965995L, 955708L, 949380L, 976411L, 976413L, 976410L, 1003402L, 954869L, 952569L, 1003401L, 976758L,
            1001585L, 975307L, 965887L, 967821L, 956804L, 962492L, 1006917L, 962493L, 963219L, 988615L, 997480L,
            989703L, 989704L, 997482L, 989705L, 976400L, 999666L, 951482L, 951328L, 952778L, 986790L, 959290L,
            978926L, 952777L, 952535L, 951688L, 960288L, 960287L, 988611L, 986795L, 960286L, 988610L, 962341L,
            961008L, 988605L, 961246L, 961125L, 949161L, 988608L, 972153L, 959297L, 953873L, 953870L, 1001490L,
            960291L, 976614L, 960290L, 953514L, 960293L, 962235L, 986300L, 956907L, 984479L, 962346L, 965737L,
            950374L, 1002451L, 995087L, 1001796L, 976327L, 976328L, 954416L, 951148L, 1000101L, 953205L, 989768L,
            950182L, 965307L, 956721L, 956965L, 976455L, 976337L, 952366L, 976330L, 954549L, 953579L, 962298L,
            989876L, 964476L, 964355L, 987331L, 988540L, 987330L, 956730L, 956731L, 950071L, 957823L, 999740L,
            973176L, 978501L, 976325L, 976326L, 952256L, 973179L, 973178L, 975354L, 973177L, 987325L, 987445L,
            956823L, 996240L, 953554L, 998662L, 978976L, 952465L, 974136L, 976419L, 1001444L, 976415L, 976416L,
            951019L, 983193L, 976418L, 961183L, 989730L, 986218L, 986217L, 967718L, 976422L, 953203L, 976420L,
            975210L, 1006529L, 965590L, 966326L, 957848L, 968745L, 967654L, 989687L, 975160L, 954340L, 997194L,
            966319L, 956403L, 958946L, 966318L, 952044L, 954343L, 954101L, 955791L, 957970L, 954229L, 1003003L,
            954228L, 967788L, 988342L, 967302L, 977451L, 957986L, 957989L, 1005541L, 1003481L, 954112L, 947907L,
            979511L, 976349L, 953109L, 1003399L, 947702L, 989424L, 967635L, 978650L, 957830L, 957952L, 999274L,
            956501L, 957834L, 1003396L, 1006663L, 1003397L, 976357L, 1003395L, 948904L, 976352L, 976354L, 962192L,
            1005444L, 989413L, 965347L, 956505L, 987595L, 966797L, 966433L, 976340L, 975251L, 990759L, 957844L,
            955787L, 958814L, 992812L, 990754L, 976345L, 975135L, 947806L, 976341L, 975252L, 1003382L, 990230L,
            947840L, 967334L, 967335L, 966119L, 997030L, 956449L, 998001L, 1003573L, 999452L, 981518L, 992765L,
            990467L, 959950L, 989592L, 1003207L, 1004898L, 968316L, 950904L, 959721L, 955120L, 959965L, 958876L,
            958875L, 967219L, 976169L, 960826L, 999222L, 957780L, 960709L, 956451L, 976168L, 947862L, 947868L,
            947867L, 968405L, 966104L, 957629L, 966589L, 1006629L, 953392L, 959931L, 956424L, 998260L, 957514L,
            956425L, 991417L, 957879L, 998023L, 978579L, 976037L, 982705L, 955216L, 982949L, 953398L, 953396L,
            1003348L, 1001045L, 949914L, 970834L, 970833L, 970957L, 987154L, 967442L, 956794L, 952194L, 957522L,
            959821L, 956436L, 959825L, 958736L, 958615L, 1000194L, 954012L, 956793L, 969432L, 948613L, 947886L,
            947887L, 970544L, 991361L, 948973L, 967014L, 958786L, 1007450L, 960851L, 959514L, 957214L, 958787L,
            957699L, 959516L, 953093L, 959515L, 961827L, 958781L, 955278L, 955157L, 958784L, 956484L, 956242L,
            961708L, 970410L, 989155L, 970411L, 965080L, 971745L, 988069L, 971628L, 947993L, 960990L, 980462L,
            980461L, 977173L, 1007685L, 958679L, 983725L, 984938L, 984937L, 1004297L, 979597L, 961718L, 961719L,
            991582L, 948514L, 967353L, 991581L, 970406L, 970409L, 970408L, 957434L, 955250L, 981897L, 982987L,
            960833L, 993996L, 993995L, 978497L, 993994L, 948501L, 948505L, 972933L, 958409L, 968337L, 969304L,
            949950L, 956598L, 1007100L, 957567L, 956237L, 1007102L, 991207L, 958410L, 968266L, 947688L, 947687L,
            947569L, 948891L, 1007657L, 949862L, 949861L, 957014L, 981113L, 960532L, 959437L, 956048L, 958105L,
            956049L, 960535L, 1003296L, 957130L, 961628L, 958463L, 961509L, 991032L, 991030L, 994781L, 991150L,
            959324L, 959689L, 984615L, 961510L, 955084L, 1007400L, 958470L, 959321L, 959683L, 959320L, 994896L,
            959323L, 957023L, 959322L, 971533L, 968486L, 950957L, 949887L, 949886L, 981340L, 978175L, 959896L,
            959535L, 982667L, 978173L, 979267L, 970573L, 957595L, 994763L, 1003189L, 947691L, 947570L, 974918L,
            947690L, 989178L, 968259L, 948782L, 957245L, 994519L, 1005003L, 958690L, 992457L, 958692L, 958691L,
            994754L, 957242L, 994753L, 957365L
    );

    private final List<Long> INST_IDS_NEW = Arrays.asList(
            951625L, 996658L, 949666L, 951623L, 953922L, 953921L, 948219L, 948451L, 948691L, 949662L, 984545L,
            981398L, 982004L, 961786L, 969390L, 1007052L, 994587L, 959113L, 949537L, 950547L, 947477L, 951755L,
            951756L, 950543L, 972679L, 949539L, 1001981L, 982482L, 985994L, 1000777L, 960232L, 947476L, 983445L,
            986956L, 982236L, 959008L, 979194L, 979193L, 979196L, 979195L, 959484L, 964709L, 959123L, 951968L,
            950878L, 995347L, 972543L, 948116L, 972428L, 972426L, 972427L, 973519L, 986951L, 949564L, 960312L,
            958006L, 958009L, 986949L, 958008L, 955093L, 958241L, 958240L, 951970L, 970130L, 957154L, 958003L,
            957155L, 971583L, 995115L, 975803L, 948107L, 995358L, 950888L, 999713L, 975806L, 1002970L, 969384L,
            969383L, 1001767L, 960331L, 953919L, 948222L, 958016L, 959225L, 981489L, 962500L, 960208L, 951620L,
            958010L, 957283L, 958130L, 958011L, 972660L, 958014L, 958013L, 996853L, 972369L, 971039L, 953848L,
            997944L, 948379L, 951788L, 951789L, 951786L, 951302L, 951787L, 949588L, 960023L, 949587L, 984235L,
            1006282L, 960019L, 950465L, 1006284L, 1006283L, 951790L, 952404L, 950225L, 950226L, 1000738L,
            962211L, 961364L, 949330L, 949213L, 960032L, 1005182L, 966923L, 1006279L, 958195L, 959041L, 974300L,
            972243L, 969179L, 969175L, 957191L, 957192L, 950677L, 963630L, 961572L, 982273L, 960485L, 1000769L,
            959016L, 980097L, 960598L, 950440L, 969290L, 959132L, 959131L, 959497L, 959134L, 959133L, 994005L,
            959499L, 996522L, 972232L, 950448L, 949118L, 983232L, 982387L, 960125L, 979095L, 962302L, 980082L,
            980081L, 968093L, 958173L, 951784L, 973554L, 959023L, 1001115L, 976409L, 1002200L, 964545L, 965995L,
            955708L, 949380L, 976411L, 976413L, 976410L, 1003402L, 954869L, 952569L, 1003401L, 976758L,
            1001585L, 975307L, 965887L, 967821L, 956804L, 962492L, 1006917L, 962493L, 963219L, 988615L, 997480L,
            989703L, 989704L, 997482L, 989705L, 976400L, 999666L, 951482L, 951328L, 952778L, 986790L, 959290L,
            978926L, 952777L, 952535L, 951688L, 960288L, 960287L, 988611L, 986795L, 960286L, 988610L, 962341L,
            961008L, 988605L, 961246L, 961125L, 949161L, 988608L, 972153L, 959297L, 953873L, 953870L, 1001490L,
            960291L, 976614L, 960290L, 953514L, 960293L, 962235L, 986300L, 956907L, 984479L, 962346L, 965737L,
            950374L, 1002451L, 995087L, 1001796L, 976327L, 976328L, 954416L, 951148L, 1000101L, 953205L, 989768L,
            950182L, 965307L, 956721L, 956965L, 976455L, 976337L, 952366L, 976330L, 954549L, 953579L, 962298L,
            989876L, 964476L, 964355L, 987331L, 988540L, 987330L, 956730L, 956731L, 950071L, 957823L, 999740L,
            973176L, 978501L, 976325L, 976326L, 952256L, 973179L, 973178L, 975354L, 973177L, 987325L, 987445L,
            956823L, 996240L, 953554L, 998662L, 978976L, 952465L, 974136L, 976419L, 1001444L, 976415L, 976416L,
            951019L, 983193L, 976418L, 961183L, 989730L, 986218L, 986217L, 967718L, 976422L, 953203L, 976420L,
            975210L, 1006529L, 965590L, 966326L, 957848L, 968745L, 967654L, 989687L, 975160L, 954340L, 997194L,
            966319L, 956403L, 958946L, 966318L, 952044L, 954343L, 954101L, 955791L, 957970L, 954229L, 1003003L,
            954228L, 967788L, 988342L, 967302L, 977451L, 957986L, 957989L, 1005541L, 1003481L, 954112L, 947907L,
            979511L, 976349L, 953109L, 1003399L, 947702L, 989424L, 967635L, 978650L, 957830L, 957952L, 999274L,
            956501L, 957834L, 1003396L, 1006663L, 1003397L, 976357L, 1003395L, 948904L, 976352L, 976354L, 962192L,
            1005444L, 989413L, 965347L, 956505L, 987595L, 966797L, 966433L, 976340L, 975251L, 990759L, 957844L,
            955787L, 958814L, 992812L, 990754L, 976345L, 975135L, 947806L, 976341L, 975252L, 1003382L, 990230L,
            947840L, 967334L, 967335L, 966119L, 997030L, 956449L, 998001L, 1003573L, 999452L, 981518L, 992765L,
            990467L, 959950L, 989592L, 1003207L, 1004898L, 968316L, 950904L, 959721L, 955120L, 959965L, 958876L,
            958875L, 967219L, 976169L, 960826L, 999222L, 957780L, 960709L, 956451L, 976168L, 947862L, 947868L,
            947867L, 968405L, 966104L, 957629L, 966589L, 1006629L, 953392L, 959931L, 956424L, 998260L, 957514L,
            956425L, 991417L, 957879L, 998023L, 978579L, 976037L, 982705L, 955216L, 982949L, 953398L, 953396L,
            1003348L, 1001045L, 949914L, 970834L, 970833L, 970957L, 987154L, 967442L, 956794L, 952194L, 957522L,
            959821L, 956436L, 959825L, 958736L, 958615L, 1000194L, 954012L, 956793L, 969432L, 948613L, 947886L,
            947887L, 970544L, 991361L, 948973L, 967014L, 958786L, 960851L, 959514L, 957214L, 958787L, 957699L,
            959516L, 953093L, 959515L, 961827L, 958781L, 955278L, 955157L, 958784L, 956484L, 956242L,
            961708L, 970410L, 989155L, 970411L, 965080L, 971745L, 988069L, 971628L, 947993L, 960990L, 980462L,
            980461L, 977173L, 958679L, 983725L, 984938L, 984937L, 1004297L, 979597L, 961718L, 961719L, 991582L,
            948514L, 967353L, 991581L, 970406L, 970409L, 970408L, 957434L, 955250L, 981897L, 982987L,
            960833L, 993996L, 993995L, 978497L, 993994L, 948501L, 948505L, 972933L, 958409L, 968337L, 969304L,
            949950L, 956598L, 1007100L, 957567L, 956237L, 1007102L, 991207L, 958410L, 968266L, 947688L, 947687L,
            947569L, 948891L, 949862L, 949861L, 957014L, 981113L, 960532L, 959437L, 956048L, 958105L, 956049L,
            960535L, 1003296L, 957130L, 961628L, 958463L, 961509L, 991032L, 991030L, 994781L, 991150L,
            959324L, 959689L, 984615L, 961510L, 955084L, 958470L, 959321L, 959683L, 959320L, 994896L, 959323L,
            957023L, 959322L, 971533L, 968486L, 950957L, 949887L, 949886L, 981340L, 978175L, 959896L,
            959535L, 982667L, 978173L, 979267L, 970573L, 957595L, 994763L, 1003189L, 947691L, 947570L, 974918L,
            947690L, 989178L, 968259L, 948782L, 957245L, 994519L, 1005003L, 958690L, 992457L, 958692L, 958691L,
            994754L, 957242L, 994753L, 957365L
    );

    /**
     * 当前测试账号在系统中与数据库共有数据
     */
    @Test
    void getKnownFormSetInstList() {
        List<MvFormsetInst> mvFormsetInsts = mvFormsetInstService.listByIds(INST_IDS_NEW);
        for (MvFormsetInst mvFormsetInst : mvFormsetInsts) {
            // mvFormsetInst
        }
    }

    @Test
    void getAllFolder() {
        List<MvFormsetInst> list = mvFormsetInstService.list();
        final Map<Long, String> map = new HashMap<>();
        list.forEach(item -> map.put(item.getFolderId(), item.getFolderName()));
        log.info("map: [{}]", map);
    }

}
