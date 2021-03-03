package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0754;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0754Service extends IService<Formmain0754> {


    int updateBatch(List<Formmain0754> list);

    int updateBatchSelective(List<Formmain0754> list);

    int batchInsert(List<Formmain0754> list);

    int insertOrUpdate(Formmain0754 record);

    int insertOrUpdateSelective(Formmain0754 record);

}
