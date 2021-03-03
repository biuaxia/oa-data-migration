package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0912;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0912Service extends IService<Formmain0912> {


    int updateBatch(List<Formmain0912> list);

    int updateBatchSelective(List<Formmain0912> list);

    int batchInsert(List<Formmain0912> list);

    int insertOrUpdate(Formmain0912 record);

    int insertOrUpdateSelective(Formmain0912 record);

}
