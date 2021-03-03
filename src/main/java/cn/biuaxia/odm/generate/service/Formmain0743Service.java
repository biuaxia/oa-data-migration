package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0743;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0743Service extends IService<Formmain0743> {


    int updateBatch(List<Formmain0743> list);

    int updateBatchSelective(List<Formmain0743> list);

    int batchInsert(List<Formmain0743> list);

    int insertOrUpdate(Formmain0743 record);

    int insertOrUpdateSelective(Formmain0743 record);

}
