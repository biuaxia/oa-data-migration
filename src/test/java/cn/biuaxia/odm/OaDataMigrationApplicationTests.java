package cn.biuaxia.odm;

import cn.biuaxia.odm.generate.domain.EdocSummary;
import cn.biuaxia.odm.generate.service.EdocSummaryService;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.Convert;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.comparator.Comparators;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OaDataMigrationApplicationTests {

    /**
     * 计时器
     */
    private final TimeInterval interval = new TimeInterval();

    @Autowired
    private EdocSummaryService edocSummaryService;

    @Test
    public void contextLoads() {
        interval.start();
        // getAllDataExistMapperBean(interval);
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
