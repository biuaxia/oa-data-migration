package cn.biuaxia.data.migration.generate.orcl.service;

import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UmCommonService extends IService<UmCommon> {
    
    int updateBatch(List<UmCommon> list);

    int updateBatchSelective(List<UmCommon> list);

    int batchInsert(List<UmCommon> list);

    int insertOrUpdate(UmCommon record);

    int insertOrUpdateSelective(UmCommon record);

}
