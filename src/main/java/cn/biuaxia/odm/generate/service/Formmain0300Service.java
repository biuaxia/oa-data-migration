package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0300;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0300Service extends IService<Formmain0300> {


    int updateBatch(List<Formmain0300> list);

    int updateBatchSelective(List<Formmain0300> list);

    int batchInsert(List<Formmain0300> list);

    int insertOrUpdate(Formmain0300 record);

    int insertOrUpdateSelective(Formmain0300 record);

}
