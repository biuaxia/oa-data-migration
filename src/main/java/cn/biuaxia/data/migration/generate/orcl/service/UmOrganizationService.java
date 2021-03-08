package cn.biuaxia.data.migration.generate.orcl.service;

import cn.biuaxia.data.migration.generate.orcl.domain.UmOrganization;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UmOrganizationService extends IService<UmOrganization>{


    int updateBatch(List<UmOrganization> list);

    int updateBatchSelective(List<UmOrganization> list);

    int batchInsert(List<UmOrganization> list);

    int insertOrUpdate(UmOrganization record);

    int insertOrUpdateSelective(UmOrganization record);

}
