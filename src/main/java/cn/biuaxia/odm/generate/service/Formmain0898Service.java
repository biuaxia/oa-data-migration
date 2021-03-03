package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0898;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0898Service extends IService<Formmain0898> {


    int updateBatch(List<Formmain0898> list);

    int updateBatchSelective(List<Formmain0898> list);

    int batchInsert(List<Formmain0898> list);

    int insertOrUpdate(Formmain0898 record);

    int insertOrUpdateSelective(Formmain0898 record);

}
