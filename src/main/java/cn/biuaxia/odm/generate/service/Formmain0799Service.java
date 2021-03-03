package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0799;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0799Service extends IService<Formmain0799> {


    int updateBatch(List<Formmain0799> list);

    int updateBatchSelective(List<Formmain0799> list);

    int batchInsert(List<Formmain0799> list);

    int insertOrUpdate(Formmain0799 record);

    int insertOrUpdateSelective(Formmain0799 record);

}
