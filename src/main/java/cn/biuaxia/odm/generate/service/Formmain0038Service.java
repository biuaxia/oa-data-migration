package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0038;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0038Service extends IService<Formmain0038> {

    int updateBatch(List<Formmain0038> list);

    int updateBatchSelective(List<Formmain0038> list);

    int batchInsert(List<Formmain0038> list);

    int insertOrUpdate(Formmain0038 record);

    int insertOrUpdateSelective(Formmain0038 record);

}
