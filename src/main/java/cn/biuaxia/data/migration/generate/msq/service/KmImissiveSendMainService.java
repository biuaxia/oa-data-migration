package cn.biuaxia.data.migration.generate.msq.service;

import cn.biuaxia.data.migration.generate.msq.domain.KmImissiveSendMain;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface KmImissiveSendMainService extends IService<KmImissiveSendMain> {


    int updateBatch(List<KmImissiveSendMain> list);

    int updateBatchSelective(List<KmImissiveSendMain> list);

    int batchInsert(List<KmImissiveSendMain> list);

    int insertOrUpdate(KmImissiveSendMain record);

    int insertOrUpdateSelective(KmImissiveSendMain record);

}
