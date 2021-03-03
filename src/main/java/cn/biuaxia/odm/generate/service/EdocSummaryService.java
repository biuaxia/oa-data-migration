package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.EdocSummary;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface EdocSummaryService extends IService<EdocSummary> {

    int updateBatch(List<EdocSummary> list);

    int updateBatchSelective(List<EdocSummary> list);

    int batchInsert(List<EdocSummary> list);

    int insertOrUpdate(EdocSummary record);

    int insertOrUpdateSelective(EdocSummary record);

}

