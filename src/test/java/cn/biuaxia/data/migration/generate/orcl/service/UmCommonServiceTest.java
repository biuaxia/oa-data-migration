package cn.biuaxia.data.migration.generate.orcl.service;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgElement;
import cn.biuaxia.data.migration.generate.msq.domain.SysOrgPerson;
import cn.biuaxia.data.migration.generate.msq.service.SysOrgElementService;
import cn.biuaxia.data.migration.generate.msq.service.SysOrgPersonService;
import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@SpringBootTest
class UmCommonServiceTest {

    @Autowired
    private SysOrgElementService sysOrgElementService;

    @Autowired
    private SysOrgPersonService sysOrgPersonService;

    @Autowired
    private UmCommonService umCommonService;

    @Autowired
    private UmOrganizationService umOrganizationService;

    @Autowired
    private UmGroupService umGroupService;

    @Autowired
    private UmUserService umUserService;

    final LambdaQueryWrapper<UmCommon> deptWrapper =
            Wrappers.<UmCommon>lambdaQuery()
                    .eq(UmCommon::getOptions, 0);
    final LambdaQueryWrapper<UmCommon> groupWrapper =
            Wrappers.<UmCommon>lambdaQuery()
                    .eq(UmCommon::getOptions, 1);
    final LambdaQueryWrapper<UmCommon> personWrapper =
            Wrappers.<UmCommon>lambdaQuery()
                    .eq(UmCommon::getOptions, 2);

    @Test
    void count() {
        log.info("用户管理数据: [{}]", umCommonService.count());
        log.info("部门总数: [{}, {}]", umOrganizationService.count(), umCommonService.count(deptWrapper));
        log.info("常用组总数: [{}, {}]", umGroupService.count(), umCommonService.count(groupWrapper));
        log.info("人员总数: [{}, {}]", umUserService.count(), umCommonService.count(personWrapper));

        List<UmUser> srcList = umUserService.list();
        List<UmCommon> destList = umCommonService.list(personWrapper);

        List<Integer> srcIdList = CollUtil.getFieldValues(srcList, "id", Integer.class);
        List<Integer> descIdList = CollUtil.getFieldValues(destList, "id", Integer.class);

        Collection<Integer> disjunction = CollUtil.disjunction(srcIdList, descIdList);
        log.info("人员数据差集: [{} - {}], {}", srcIdList.size(), descIdList.size(), JSONUtil.toJsonPrettyStr(disjunction));
    }

    @Test
    void deptList() {
        ArrayList<SysOrgElement> elements = CollUtil.newArrayList();
        List<UmCommon> deptList = umCommonService.list(deptWrapper);
        deptList.forEach(item -> {
            elements.add(SysOrgElement.buildDept(item));
        });
        log.info("elements.size(): [{}], [{}]", elements.size(), JSONUtil.toJsonPrettyStr(elements.get(0)));
        sysOrgElementService.batchInsert(elements);
    }

    @Test
    void groupList() {
        ArrayList<SysOrgElement> elements = CollUtil.newArrayList();
        List<UmCommon> groupList = umCommonService.list(groupWrapper);
        groupList.forEach(item -> {
            elements.add(SysOrgElement.buildGroup(item));
        });
        log.info("elements.size(): [{}], [{}]", elements.size(), JSONUtil.toJsonPrettyStr(elements.get(0)));
        sysOrgElementService.batchInsert(elements);
    }

    @Test
    void personList() {
        ArrayList<SysOrgPerson> persons = CollUtil.newArrayList();
        ArrayList<SysOrgElement> elements = CollUtil.newArrayList();
        // 人员以umUser为准
        List<UmUser> umUserList = umUserService.list();
        List<UmCommon> umCommonList = umCommonService.list();
        Map<Long, List<UmCommon>> umCommonMap = umCommonList.stream().collect(Collectors.groupingBy(UmCommon::getId));
        umUserList.forEach(item->{
            Long id = item.getId();
            List<UmCommon> umCommons = umCommonMap.get(id);
            UmCommon umCommon = umCommons.get(umCommons.size() - 1);
            String fdId = IdUtil.fastSimpleUUID();
            SysOrgPerson sysOrgPerson = SysOrgPerson.build(fdId,item, umCommon);
            persons.add(sysOrgPerson);
            SysOrgElement sysOrgElement = SysOrgElement.buildPerson(fdId,item, umCommon);
            elements.add(sysOrgElement);
        });
        log.info("persons.size(): [{}], [{}]", persons.size(), JSONUtil.toJsonPrettyStr(persons.get(0)));
        log.info("elements.size(): [{}], [{}]", elements.size(), JSONUtil.toJsonPrettyStr(elements.get(0)));
        sysOrgElementService.batchInsert(elements);
        sysOrgPersonService.batchInsert(persons);
    }

}