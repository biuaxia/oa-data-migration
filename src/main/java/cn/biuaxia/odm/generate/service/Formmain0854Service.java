package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0854;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0854Service extends IService<Formmain0854> {


    int updateBatch(List<Formmain0854> list);

    int updateBatchSelective(List<Formmain0854> list);

    int batchInsert(List<Formmain0854> list);

    int insertOrUpdate(Formmain0854 record);

    int insertOrUpdateSelective(Formmain0854 record);

}
