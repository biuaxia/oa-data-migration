package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0896;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0896Service extends IService<Formmain0896> {


    int updateBatch(List<Formmain0896> list);

    int updateBatchSelective(List<Formmain0896> list);

    int batchInsert(List<Formmain0896> list);

    int insertOrUpdate(Formmain0896 record);

    int insertOrUpdateSelective(Formmain0896 record);

}
