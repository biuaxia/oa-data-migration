package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0781;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0781Service extends IService<Formmain0781> {


    int updateBatch(List<Formmain0781> list);

    int updateBatchSelective(List<Formmain0781> list);

    int batchInsert(List<Formmain0781> list);

    int insertOrUpdate(Formmain0781 record);

    int insertOrUpdateSelective(Formmain0781 record);

}
