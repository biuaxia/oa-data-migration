package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.OaDataMigrationApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CtpAttachmentServiceTest {

    @Autowired
    private CtpAttachmentService ctpAttachmentService;

    @Test
    public void count() {
        log.info("count: [{}]", ctpAttachmentService.count());
    }

}