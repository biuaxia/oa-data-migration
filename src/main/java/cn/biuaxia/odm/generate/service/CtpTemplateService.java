package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.CtpTemplate;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CtpTemplateService extends IService<CtpTemplate> {

    int updateBatch(List<CtpTemplate> list);

    int updateBatchSelective(List<CtpTemplate> list);

    int batchInsert(List<CtpTemplate> list);

    int insertOrUpdate(CtpTemplate record);

    int insertOrUpdateSelective(CtpTemplate record);

}
