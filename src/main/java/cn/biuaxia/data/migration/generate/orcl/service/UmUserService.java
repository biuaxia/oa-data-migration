package cn.biuaxia.data.migration.generate.orcl.service;

import java.util.List;
import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UmUserService extends IService<UmUser>{


    int updateBatch(List<UmUser> list);

    int updateBatchSelective(List<UmUser> list);

    int batchInsert(List<UmUser> list);

    int insertOrUpdate(UmUser record);

    int insertOrUpdateSelective(UmUser record);

}
