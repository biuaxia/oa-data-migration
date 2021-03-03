package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.FormDefinition;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface FormDefinitionService extends IService<FormDefinition> {

    int updateBatch(List<FormDefinition> list);

    int updateBatchSelective(List<FormDefinition> list);

    int batchInsert(List<FormDefinition> list);

    int insertOrUpdate(FormDefinition record);

    int insertOrUpdateSelective(FormDefinition record);

}
