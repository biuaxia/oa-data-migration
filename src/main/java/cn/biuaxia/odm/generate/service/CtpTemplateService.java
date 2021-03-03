package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.CtpTemplate;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CtpTemplateService extends IService<CtpTemplate> {


    int updateBatch(List<CtpTemplate> list);

    int updateBatchSelective(List<CtpTemplate> list);

    int batchInsert(List<CtpTemplate> list);

    int insertOrUpdate(CtpTemplate record);

    int insertOrUpdateSelective(CtpTemplate record);

}
