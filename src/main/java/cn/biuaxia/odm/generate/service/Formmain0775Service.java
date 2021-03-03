package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0775;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0775Service extends IService<Formmain0775> {


    int updateBatch(List<Formmain0775> list);

    int updateBatchSelective(List<Formmain0775> list);

    int batchInsert(List<Formmain0775> list);

    int insertOrUpdate(Formmain0775 record);

    int insertOrUpdateSelective(Formmain0775 record);

}
