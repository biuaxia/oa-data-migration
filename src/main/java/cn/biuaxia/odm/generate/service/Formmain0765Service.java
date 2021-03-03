package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0765;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0765Service extends IService<Formmain0765> {


    int updateBatch(List<Formmain0765> list);

    int updateBatchSelective(List<Formmain0765> list);

    int batchInsert(List<Formmain0765> list);

    int insertOrUpdate(Formmain0765 record);

    int insertOrUpdateSelective(Formmain0765 record);

}
