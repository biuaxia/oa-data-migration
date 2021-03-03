package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0489;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0489Service extends IService<Formmain0489> {


    int updateBatch(List<Formmain0489> list);

    int updateBatchSelective(List<Formmain0489> list);

    int batchInsert(List<Formmain0489> list);

    int insertOrUpdate(Formmain0489 record);

    int insertOrUpdateSelective(Formmain0489 record);

}
