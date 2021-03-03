package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0731;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0731Service extends IService<Formmain0731> {


    int updateBatch(List<Formmain0731> list);

    int updateBatchSelective(List<Formmain0731> list);

    int batchInsert(List<Formmain0731> list);

    int insertOrUpdate(Formmain0731 record);

    int insertOrUpdateSelective(Formmain0731 record);

}
