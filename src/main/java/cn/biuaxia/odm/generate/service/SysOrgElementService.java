package cn.biuaxia.odm.generate.service;

import java.util.List;
import cn.biuaxia.odm.generate.domain.SysOrgElement;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysOrgElementService extends IService<SysOrgElement>{


    int updateBatch(List<SysOrgElement> list);

    int updateBatchSelective(List<SysOrgElement> list);

    int batchInsert(List<SysOrgElement> list);

    int insertOrUpdate(SysOrgElement record);

    int insertOrUpdateSelective(SysOrgElement record);

}
