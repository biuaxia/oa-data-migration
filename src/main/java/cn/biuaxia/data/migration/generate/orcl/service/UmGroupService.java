package cn.biuaxia.data.migration.generate.orcl.service;

import java.util.List;
import cn.biuaxia.data.migration.generate.orcl.domain.UmGroup;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UmGroupService extends IService<UmGroup>{


    int updateBatch(List<UmGroup> list);

    int updateBatchSelective(List<UmGroup> list);

    int batchInsert(List<UmGroup> list);

    int insertOrUpdate(UmGroup record);

    int insertOrUpdateSelective(UmGroup record);

}
