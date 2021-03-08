package cn.biuaxia.data.migration.generate.orcl.service;

import cn.biuaxia.data.migration.generate.orcl.domain.MvFormsetInst;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@SpringBootTest
class MvFormsetInstServiceTest {

    @Autowired
    private MvFormsetInstService mvFormsetInstService;

    @Test
    void count() {
        log.info("mvFormsetInstService.count(): [{}]", mvFormsetInstService.count());
    }

    @Test
    void list() {
        log.info("mvFormsetInstService.list(): [{}]",
                 JSONUtil.toJsonPrettyStr(mvFormsetInstService.list(
                         Wrappers.<MvFormsetInst>lambdaQuery()
                                 .in(MvFormsetInst::getFormsetInstId,
                                     965417, 965418, 965419
                                 ))));
    }

    @Test
    void export() throws InvocationTargetException, IllegalAccessException {
        for (int i = 1; i < 31; i++) {
            Method method = ReflectUtil.getMethod(this.getClass(), StrUtil.format("deptExt{}", i));
            method.invoke(this);
        }
    }

    @Test
    void deptExt1() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt1;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext1"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt2() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt2;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext2"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt3() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt3;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext3"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt4() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt4;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext4"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt5() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt5;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext5"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt6() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt6;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext6"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt7() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt7;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext7"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt8() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt8;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext8"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt9() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt9;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext9"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt10() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt10;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext10"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt11() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt11;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext11"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt12() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt12;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext12"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt13() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt13;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext13"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt14() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt14;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext14"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt15() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt15;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext15"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt16() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt16;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext16"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt17() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt17;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext17"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt18() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt18;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext18"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt19() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt19;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext19"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt20() {
        SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt20;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<String, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext20"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt21() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt21;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext21"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt22() {
            SFunction<MvFormsetInst, String> classifier = MvFormsetInst::getExt22;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<String, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<String, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext22"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt23() {
            SFunction<MvFormsetInst, Long> classifier = MvFormsetInst::getExt23;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<Long, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<Long, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext23"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt24() {
            SFunction<MvFormsetInst, Long> classifier = MvFormsetInst::getExt24;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<Long, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<Long, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext24"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt25() {
            SFunction<MvFormsetInst, Long> classifier = MvFormsetInst::getExt25;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<Long, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<Long, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext25"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt26() {
            SFunction<MvFormsetInst, Long> classifier = MvFormsetInst::getExt26;
            LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                    .isNotNull(classifier);
            List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
            log.info("list.size(): [{}]", list.size());
            Map<Long, List<MvFormsetInst>> collect =
                    list.stream().collect(Collectors.groupingBy(classifier));
            Map<Long, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
            collect.forEach((key, mvFormsetInsts) -> {
                List<Long> formsetInstId =
                        CollUtil.getFieldValues(mvFormsetInsts,
                                                "formsetInstId",
                                                Long.class);
                resutlMap.put(key, formsetInstId);
            });

            File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext26"));
            FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt27() {
        SFunction<MvFormsetInst, Date> classifier = MvFormsetInst::getExt27;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<Date, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<Date, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext27"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt28() {
        SFunction<MvFormsetInst, Date> classifier = MvFormsetInst::getExt28;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<Date, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<Date, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext28"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt29() {
        SFunction<MvFormsetInst, Date> classifier = MvFormsetInst::getExt29;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<Date, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<Date, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext29"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

    @Test
    void deptExt30() {
        SFunction<MvFormsetInst, Date> classifier = MvFormsetInst::getExt30;
        LambdaQueryWrapper<MvFormsetInst> queryWrapper = Wrappers.<MvFormsetInst>lambdaQuery()
                .isNotNull(classifier);
        List<MvFormsetInst> list = mvFormsetInstService.list(queryWrapper);
        log.info("list.size(): [{}]", list.size());
        Map<Date, List<MvFormsetInst>> collect =
                list.stream().collect(Collectors.groupingBy(classifier));
        Map<Date, List<Long>> resutlMap = CollUtil.newHashMap(list.size());
        collect.forEach((key, mvFormsetInsts) -> {
            List<Long> formsetInstId =
                    CollUtil.getFieldValues(mvFormsetInsts,
                                            "formsetInstId",
                                            Long.class);
            resutlMap.put(key, formsetInstId);
        });

        File file = FileUtil.file(StrUtil.format("d:/{}.json", "ext30"));
        FileUtil.writeUtf8String(JSONUtil.toJsonPrettyStr(resutlMap), file);
    }

}