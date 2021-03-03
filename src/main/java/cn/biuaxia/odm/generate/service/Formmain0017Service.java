package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0017;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0017Service extends IService<Formmain0017> {


    int updateBatch(List<Formmain0017> list);

    int updateBatchSelective(List<Formmain0017> list);

    int batchInsert(List<Formmain0017> list);

    int insertOrUpdate(Formmain0017 record);

    int insertOrUpdateSelective(Formmain0017 record);

}
