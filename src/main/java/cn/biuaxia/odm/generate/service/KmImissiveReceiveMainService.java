package cn.biuaxia.odm.generate.service;

import java.util.List;
import cn.biuaxia.odm.generate.domain.KmImissiveReceiveMain;
import com.baomidou.mybatisplus.extension.service.IService;
public interface KmImissiveReceiveMainService extends IService<KmImissiveReceiveMain>{


    int updateBatch(List<KmImissiveReceiveMain> list);

    int updateBatchSelective(List<KmImissiveReceiveMain> list);

    int batchInsert(List<KmImissiveReceiveMain> list);

    int insertOrUpdate(KmImissiveReceiveMain record);

    int insertOrUpdateSelective(KmImissiveReceiveMain record);

}
