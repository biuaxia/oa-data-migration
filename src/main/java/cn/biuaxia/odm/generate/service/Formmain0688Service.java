package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0688;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0688Service extends IService<Formmain0688> {

    int updateBatch(List<Formmain0688> list);

    int updateBatchSelective(List<Formmain0688> list);

    int batchInsert(List<Formmain0688> list);

    int insertOrUpdate(Formmain0688 record);

    int insertOrUpdateSelective(Formmain0688 record);

}
