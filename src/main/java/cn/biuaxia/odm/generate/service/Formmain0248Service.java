package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0248;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0248Service extends IService<Formmain0248> {


    int updateBatch(List<Formmain0248> list);

    int updateBatchSelective(List<Formmain0248> list);

    int batchInsert(List<Formmain0248> list);

    int insertOrUpdate(Formmain0248 record);

    int insertOrUpdateSelective(Formmain0248 record);

}
