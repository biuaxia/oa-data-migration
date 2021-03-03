package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.ColSummary;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface ColSummaryService extends IService<ColSummary> {

    int updateBatch(List<ColSummary> list);

    int updateBatchSelective(List<ColSummary> list);

    int batchInsert(List<ColSummary> list);

    int insertOrUpdate(ColSummary record);

    int insertOrUpdateSelective(ColSummary record);

}
