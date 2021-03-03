package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.FormResource;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FormResourceService extends IService<FormResource> {

    int updateBatch(List<FormResource> list);

    int updateBatchSelective(List<FormResource> list);

    int batchInsert(List<FormResource> list);

    int insertOrUpdate(FormResource record);

    int insertOrUpdateSelective(FormResource record);

}
