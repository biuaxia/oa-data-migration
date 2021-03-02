package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.OaDataMigrationApplication;
import cn.biuaxia.odm.generate.domain.EdocSummary;
import cn.biuaxia.odm.generate.service.EdocSummaryService;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Wrapper;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EdocSummaryMapperTest {

    @Autowired
    private EdocSummaryService edocSummaryService;

    @Test
    public void count() {
        log.info("count: [{}]", edocSummaryService.count());
        log.info("count-4: [{}]", edocSummaryService.count(
                Wrappers.<EdocSummary>lambdaQuery()
                        .eq(EdocSummary::getState, 4)
        ));
        log.info("count-3: [{}]", edocSummaryService.count(
                Wrappers.<EdocSummary>lambdaQuery()
                        .eq(EdocSummary::getState, 3)
        ));
        log.info("count-2: [{}]", edocSummaryService.count(
                Wrappers.<EdocSummary>lambdaQuery()
                        .eq(EdocSummary::getState, 2)
        ));
        log.info("count-1: [{}]", edocSummaryService.count(
                Wrappers.<EdocSummary>lambdaQuery()
                        .eq(EdocSummary::getState, 1)
        ));
        log.info("count-0: [{}]", edocSummaryService.count(
                Wrappers.<EdocSummary>lambdaQuery()
                        .eq(EdocSummary::getState, 0)
        ));
    }

    @Test
    public void getOne() {
        log.info("getOne: [{}]", JSONUtil.toJsonPrettyStr(
                edocSummaryService.getOne(
                        Wrappers.<EdocSummary>lambdaQuery()
                                .eq(EdocSummary::getId, -9222701066449894146L))
        ));
    }

    @Test
    public void page() {
        log.info("page: [{}]", JSONUtil.toJsonPrettyStr(
                edocSummaryService.page(
                        new Page<>(1, 2),
                        Wrappers.<EdocSummary>lambdaQuery()
                                .eq(EdocSummary::getState, 3))
        ));
    }

}