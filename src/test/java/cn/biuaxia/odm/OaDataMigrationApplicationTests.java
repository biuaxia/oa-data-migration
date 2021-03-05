package cn.biuaxia.odm;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OaDataMigrationApplicationTests {

    @Test
    public void analysisExistDataGroupByLength() {
        String basePath = "/Users/biuaxia/Downloads/D/D";
        List<String> listFileNames = FileUtil.listFileNames(basePath);
        log.info("{}", listFileNames);
        listFileNames.forEach(item -> {
            String filePath = StrUtil.format("{}/{}", basePath, item);
            String readUtf8String = FileUtil.readUtf8String(filePath);
            JSONObject jsonObject = JSONUtil.parseObj(readUtf8String);
            log.info("\t{} -> [{}]", StrUtil.subBefore(item, ".", true), jsonObject.size());
            Set<String> keySet = jsonObject.keySet();
            List<Integer> keyLengths = new ArrayList<>();
            keySet.removeIf(k -> {
                if (keyLengths.contains(k.length()) || StrUtil.isBlank(k)) {
                    return true;
                } else {
                    keyLengths.add(k.length());
                    return false;
                }
            });
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(keySet),
                    StrUtil.format("{}/new/{}", basePath, item));
        });
    }

}
