package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.EdocSummary;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EdocSummaryService extends IService<EdocSummary> {

    int updateBatch(List<EdocSummary> list);

    int updateBatchSelective(List<EdocSummary> list);

    int batchInsert(List<EdocSummary> list);

    int insertOrUpdate(EdocSummary record);

    int insertOrUpdateSelective(EdocSummary record);

}

