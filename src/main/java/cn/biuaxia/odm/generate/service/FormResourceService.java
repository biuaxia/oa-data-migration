package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.FormResource;
import com.baomidou.mybatisplus.extension.service.IService;

public interface FormResourceService extends IService<FormResource> {


    int updateBatch(List<FormResource> list);

    int updateBatchSelective(List<FormResource> list);

    int batchInsert(List<FormResource> list);

    int insertOrUpdate(FormResource record);

    int insertOrUpdateSelective(FormResource record);

}
