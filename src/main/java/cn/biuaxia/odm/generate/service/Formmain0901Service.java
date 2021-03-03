package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0901;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0901Service extends IService<Formmain0901> {


    int updateBatch(List<Formmain0901> list);

    int updateBatchSelective(List<Formmain0901> list);

    int batchInsert(List<Formmain0901> list);

    int insertOrUpdate(Formmain0901 record);

    int insertOrUpdateSelective(Formmain0901 record);

}
