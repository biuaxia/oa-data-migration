package cn.biuaxia.data.migration.generate.orcl.service;

import java.util.List;
import cn.biuaxia.data.migration.generate.orcl.domain.UmLeader;
import com.baomidou.mybatisplus.extension.service.IService;
public interface UmLeaderService extends IService<UmLeader>{


    int updateBatch(List<UmLeader> list);

    int updateBatchSelective(List<UmLeader> list);

    int batchInsert(List<UmLeader> list);

    int insertOrUpdate(UmLeader record);

    int insertOrUpdateSelective(UmLeader record);

}
