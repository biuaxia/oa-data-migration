package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.OrgUnit;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface OrgUnitService extends IService<OrgUnit> {


    int updateBatch(List<OrgUnit> list);

    int updateBatchSelective(List<OrgUnit> list);

    int batchInsert(List<OrgUnit> list);

    int insertOrUpdate(OrgUnit record);

    int insertOrUpdateSelective(OrgUnit record);

}
