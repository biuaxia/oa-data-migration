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

import java.util.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OaDataMigrationApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OaDataMigrationApplicationTests {

    @Test
    public void analysisExistDataGroupByLength() {
        String basePath = "/Users/biuaxia/Downloads/D/D";
        List<String> listFileNames = FileUtil.listFileNames(basePath);
        listFileNames.removeIf(item -> !item.contains(".json"));
        log.info("{}", listFileNames);
        listFileNames.forEach(item -> {
            log.info("=====================");
            String filePath = StrUtil.format("{}/{}", basePath, item);
            log.info("[{}]", StrUtil.subBefore(item, ".", true));
            String readUtf8String = FileUtil.readUtf8String(filePath);
            JSONObject jsonObject = JSONUtil.parseObj(readUtf8String);
            log.info("\t[{}]", jsonObject.size());
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
            Map<String, List<Long>> m = new HashMap<>();
            for (String s : keySet) {
                m.put(s, jsonObject.getJSONArray(s).toList(Long.class));
            }
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(m),
                    StrUtil.format("{}/new/{}", basePath, item));
        });
    }

}
