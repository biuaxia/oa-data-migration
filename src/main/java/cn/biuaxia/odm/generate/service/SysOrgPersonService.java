package cn.biuaxia.odm.generate.service;

import java.util.List;
import cn.biuaxia.odm.generate.domain.SysOrgPerson;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysOrgPersonService extends IService<SysOrgPerson>{


    int updateBatch(List<SysOrgPerson> list);

    int updateBatchSelective(List<SysOrgPerson> list);

    int batchInsert(List<SysOrgPerson> list);

    int insertOrUpdate(SysOrgPerson record);

    int insertOrUpdateSelective(SysOrgPerson record);

}
