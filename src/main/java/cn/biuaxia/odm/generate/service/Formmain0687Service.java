package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0687;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0687Service extends IService<Formmain0687> {


    int updateBatch(List<Formmain0687> list);

    int updateBatchSelective(List<Formmain0687> list);

    int batchInsert(List<Formmain0687> list);

    int insertOrUpdate(Formmain0687 record);

    int insertOrUpdateSelective(Formmain0687 record);

}
