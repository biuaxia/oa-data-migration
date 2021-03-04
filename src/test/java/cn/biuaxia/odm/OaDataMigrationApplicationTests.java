package cn.biuaxia.odm;

import cn.biuaxia.odm.generate.domain.EdocSummary;
import cn.biuaxia.odm.generate.domain.OrgMember;
import cn.biuaxia.odm.generate.domain.OrgUnit;
import cn.biuaxia.odm.generate.service.EdocSummaryService;
import cn.biuaxia.odm.generate.service.OrgMemberService;
import cn.biuaxia.odm.generate.service.OrgUnitService;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OaDataMigrationApplicationTests {

    /**
     * 项目路径
     */
    private final String projectPath = System.getProperty("user.dir");

    /**
     * 计时器
     */
    private final TimeInterval interval = new TimeInterval();

    /**
     * 人员Map
     */
    private Map<Long, Optional<OrgMember>> memberMap = new HashMap<>();

    /**
     * 单位Map
     */
    private Map<Long, Optional<OrgUnit>> unitMap = new HashMap<>();

    @Autowired
    private EdocSummaryService edocSummaryService;

    @Autowired
    private OrgMemberService orgMemberService;

    @Autowired
    private OrgUnitService orgUnitService;

    @Test
    public void contextLoads() {
        interval.start();

        getAllReceAndSendMember();
        log.info("获取人员Map [{}] 个", memberMap.size());
        /*log.info("0: [{}]", JSONUtil.toJsonPrettyStr(
                memberMap.get(CollUtil.get(memberMap.keySet(), 0)).orElse(null)
        ));*/
        getAllReceAndSendUnit();
        log.info("获取单位Map [{}] 个", unitMap.size());
        /*log.info("0: [{}]", JSONUtil.toJsonPrettyStr(
                unitMap.get(CollUtil.get(unitMap.keySet(), 0)).orElse(null)
        ));*/

        log.info("共计耗时: [{}s]", interval.intervalSecond());
    }

    /**
     * 获取所有发文收文单位
     */
    private void getAllReceAndSendUnit() {
        // 单位条件
        LambdaQueryWrapper<EdocSummary> baseWrapper = Wrappers.<EdocSummary>lambdaQuery()
                .isNotNull(EdocSummary::getSendDepartmentId)
                .eq(EdocSummary::getState, 3)
                .in(EdocSummary::getEdocType, 0, 1);
        List<String> sendUnitIdList = edocSummaryService.listObjs(baseWrapper.select(EdocSummary::getSendUnitId), Object::toString);
        List<String> sendToIdList = edocSummaryService.listObjs(baseWrapper.select(EdocSummary::getSendToId), Object::toString);
        List<String> copyToIdList = edocSummaryService.listObjs(baseWrapper.select(EdocSummary::getCopyToId), Object::toString);
        List<String> reportToIdList = edocSummaryService.listObjs(baseWrapper.select(EdocSummary::getReportToId), Object::toString);
        List<String> sendDepartmentIdList = edocSummaryService.listObjs(baseWrapper.select(EdocSummary::getSendDepartmentId), Object::toString);

        Set<String> orgUnitSet = CollUtil.unionDistinct(sendUnitIdList, sendToIdList, copyToIdList, reportToIdList, sendDepartmentIdList);

        List<OrgUnit> orgUnitList = orgUnitService.listByIds(orgUnitSet);
        unitMap = orgUnitList.stream()
                .collect(
                        Collectors.groupingBy(
                                OrgUnit::getId,
                                Collectors.maxBy(Comparators.comparable())));
    }

    /**
     * 获取所有发文收文人员
     */
    private void getAllReceAndSendMember() {
        // 收发文条件
        LambdaQueryWrapper<EdocSummary> sendDocWrapper = Wrappers.<EdocSummary>lambdaQuery()
                .eq(EdocSummary::getState, 3)
                .eq(EdocSummary::getEdocType, 0)
                .select(EdocSummary::getStartUserId)
                .groupBy(EdocSummary::getStartUserId);
        LambdaQueryWrapper<EdocSummary> receDocWrapper = Wrappers.<EdocSummary>lambdaQuery()
                .eq(EdocSummary::getState, 3)
                .eq(EdocSummary::getEdocType, 1)
                .select(EdocSummary::getStartUserId)
                .groupBy(EdocSummary::getStartUserId);

        // 发文列表
        List<Long> sendList = edocSummaryService.listObjs(sendDocWrapper, item -> Long.valueOf(item.toString()));
        // 收文列表
        List<Long> receList = edocSummaryService.listObjs(receDocWrapper, item -> Long.valueOf(item.toString()));

        log.info("发文总数: [{}], 收文总数: [{}]", sendList.size(), receList.size());

        /*FileUtil.writeUtf8String(CollUtil.join(sendList, "\n"),
                FileUtil.file(
                        StrUtil.format("{}/sendList.txt", projectPath)));
        FileUtil.writeUtf8String(CollUtil.join(receList, "\n"),
                FileUtil.file(
                        StrUtil.format("{}/receList.txt", projectPath)));
        log.info("已写入项目目录下的 receList.tet 与 sendList.txt 文件");*/

        // 合并收发文人员ID属性后去重
        Set<Long> memberIdSet = CollUtil.unionDistinct(sendList, receList);
        // log.info("人员总数: [{}]", memberIdSet.size());
        CollUtil.sort(memberIdSet, Comparators.comparable());
        /*FileUtil.writeUtf8String(CollUtil.join(memberIdSet, "\n"),
                FileUtil.file(
                        StrUtil.format("{}/memberIdSet.txt", projectPath)));*/
        List<OrgMember> orgMemberList = orgMemberService.listByIds(memberIdSet);
        memberMap = orgMemberList.stream()
                .collect(
                        Collectors.groupingBy(
                                OrgMember::getId,
                                Collectors.maxBy(Comparators.comparable())));
    }

    /**
     * 随机抽取一条公文数据
     */
    private void randGetDocData() {
        List<EdocSummary> edocSummaryList =
                edocSummaryService.list(
                        Wrappers.<EdocSummary>lambdaQuery()
                                .eq(EdocSummary::getState, 3)
                );
        log.info("正常结束的公文主表数据获取完成, 共计 [{}] 条, 耗时: [{}s], 开始分析数据...", edocSummaryList.size(), interval.intervalSecond());
        log.info("随机挑选数据得到: [{}]", JSONUtil.toJsonPrettyStr(
                edocSummaryList.get(RandomUtil.randomInt(0, edocSummaryList.size() - 1))
        ));
    }

    /**
     * 获取所有有数据的表对应的Mapper对象
     */
    private void getAllDataExistMapperBean() {
        String projectPath = System.getProperty("user.dir");
        log.info("currentProjectPath: [{}]", projectPath);
        String mapperBeanPath = StrUtil.format("{}/src/main/java/cn/biuaxia/odm/generate/mapper", projectPath);
        List<String> fileNameList = FileUtil.listFileNames(mapperBeanPath);
        List<String> fileList = CollUtil.newArrayList();
        fileNameList.forEach(item -> fileList.add(StrUtil.lowerFirst(
                StrUtil.subBefore(item, '.', true)
        )));
        CollUtil.sort(fileList, Comparators.comparable());
        log.debug("fileNameList: {}", JSONUtil.toJsonPrettyStr(fileNameList));
        log.debug("fileList: {}", JSONUtil.toJsonPrettyStr(fileList));
        List<String> hasDataTableList = CollUtil.newArrayList();
        HashMap<String, Integer> hasDataTableMap = CollUtil.newHashMap();
        fileList.forEach(item -> {
            Object beanObj = SpringUtil.getBean(item);
            Object countObj;
            if ("edocSummaryMapper".equals(item)) {
                countObj = ReflectUtil.invoke(beanObj, "selectCount",
                        Wrappers.<EdocSummary>lambdaQuery()
                                .eq(EdocSummary::getState, 3));
            } else {
                countObj = ReflectUtil.invoke(beanObj, "selectCount", Wrappers.emptyWrapper());
            }
            Integer count = Convert.toInt(countObj);
            if (null != count && 0 != count) {
                hasDataTableList.add(item);
                hasDataTableMap.put(item, count);
            }
        });

        log.info("获取所有有数据的mapperBean完成, 共计 [{}] 条, 耗时: [{}s]", hasDataTableList.size(), interval.intervalSecond());
    }

}
