package cn.biuaxia.odm.generate.service;

import java.util.List;
import cn.biuaxia.odm.generate.domain.KmImissiveSendMain;
import com.baomidou.mybatisplus.extension.service.IService;
public interface KmImissiveSendMainService extends IService<KmImissiveSendMain>{


    int updateBatch(List<KmImissiveSendMain> list);

    int updateBatchSelective(List<KmImissiveSendMain> list);

    int batchInsert(List<KmImissiveSendMain> list);

    int insertOrUpdate(KmImissiveSendMain record);

    int insertOrUpdateSelective(KmImissiveSendMain record);

}
