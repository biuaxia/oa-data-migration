package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0655;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0655Service extends IService<Formmain0655> {


    int updateBatch(List<Formmain0655> list);

    int updateBatchSelective(List<Formmain0655> list);

    int batchInsert(List<Formmain0655> list);

    int insertOrUpdate(Formmain0655 record);

    int insertOrUpdateSelective(Formmain0655 record);

}
