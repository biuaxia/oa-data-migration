package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0221;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0221Service extends IService<Formmain0221> {


    int updateBatch(List<Formmain0221> list);

    int updateBatchSelective(List<Formmain0221> list);

    int batchInsert(List<Formmain0221> list);

    int insertOrUpdate(Formmain0221 record);

    int insertOrUpdateSelective(Formmain0221 record);

}
