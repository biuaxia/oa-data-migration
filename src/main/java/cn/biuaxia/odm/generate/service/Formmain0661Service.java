package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0661;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0661Service extends IService<Formmain0661> {

    int updateBatch(List<Formmain0661> list);

    int updateBatchSelective(List<Formmain0661> list);

    int batchInsert(List<Formmain0661> list);

    int insertOrUpdate(Formmain0661 record);

    int insertOrUpdateSelective(Formmain0661 record);

}
