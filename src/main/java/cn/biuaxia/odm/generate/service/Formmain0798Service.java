package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0798;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0798Service extends IService<Formmain0798> {


    int updateBatch(List<Formmain0798> list);

    int updateBatchSelective(List<Formmain0798> list);

    int batchInsert(List<Formmain0798> list);

    int insertOrUpdate(Formmain0798 record);

    int insertOrUpdateSelective(Formmain0798 record);

}
