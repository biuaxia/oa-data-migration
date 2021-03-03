package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0215;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0215Service extends IService<Formmain0215> {

    int updateBatch(List<Formmain0215> list);

    int updateBatchSelective(List<Formmain0215> list);

    int batchInsert(List<Formmain0215> list);

    int insertOrUpdate(Formmain0215 record);

    int insertOrUpdateSelective(Formmain0215 record);

}
