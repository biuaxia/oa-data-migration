package cn.biuaxia.data.migration.generate.msq.service;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgPerson;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface SysOrgPersonService extends IService<SysOrgPerson> {

    int updateBatch(List<SysOrgPerson> list);

    int updateBatchSelective(List<SysOrgPerson> list);

    int batchInsert(List<SysOrgPerson> list);

    int insertOrUpdate(SysOrgPerson record);

    int insertOrUpdateSelective(SysOrgPerson record);

}
