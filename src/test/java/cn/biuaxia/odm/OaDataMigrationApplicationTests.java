package cn.biuaxia.odm;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OaDataMigrationApplicationTests {

    @Test
    public void contextLoads() {
        String projectPath = System.getProperty("user.dir");
        log.info("currentProjectPath: [{}]", projectPath);
        String serviceBeanPath = StrUtil.format("{}/src/main/java/cn/biuaxia/odm/generate/service", projectPath);
        List<String> fileNameList = FileUtil.listFileNames(serviceBeanPath);
        List<String> fileList = CollUtil.newArrayList();
        fileNameList.forEach(item -> fileList.add(StrUtil.lowerFirst(
                StrUtil.subBefore(item, '.', true)
        )));
        log.info("fileNameList: {}", JSONUtil.toJsonPrettyStr(fileNameList));
        log.info("fileList: {}", JSONUtil.toJsonPrettyStr(fileList));
        Object bean = SpringUtil.getBean(fileList.get(0));
        Object count = ReflectUtil.invoke(bean, "count");
        log.info("{}.count: [{}]", bean.getClass().getName(), count);
    }

}
