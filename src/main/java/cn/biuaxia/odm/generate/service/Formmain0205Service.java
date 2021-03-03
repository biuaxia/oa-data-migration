package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0205;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0205Service extends IService<Formmain0205> {


    int updateBatch(List<Formmain0205> list);

    int updateBatchSelective(List<Formmain0205> list);

    int batchInsert(List<Formmain0205> list);

    int insertOrUpdate(Formmain0205 record);

    int insertOrUpdateSelective(Formmain0205 record);

}
