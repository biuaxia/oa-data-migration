package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0721;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0721Service extends IService<Formmain0721> {


    int updateBatch(List<Formmain0721> list);

    int updateBatchSelective(List<Formmain0721> list);

    int batchInsert(List<Formmain0721> list);

    int insertOrUpdate(Formmain0721 record);

    int insertOrUpdateSelective(Formmain0721 record);

}
