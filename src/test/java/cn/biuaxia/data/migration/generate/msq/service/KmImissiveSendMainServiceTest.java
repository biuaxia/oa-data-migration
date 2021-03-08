package cn.biuaxia.data.migration.generate.msq.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class KmImissiveSendMainServiceTest {

    @Autowired
    private KmImissiveSendMainService kmImissiveSendMainService;

    @Test
    void count() {
        log.info("kmImissiveSendMainService.count(): [{}]", kmImissiveSendMainService.count());
    }

}