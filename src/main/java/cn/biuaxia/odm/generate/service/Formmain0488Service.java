package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0488;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0488Service extends IService<Formmain0488> {

    int updateBatch(List<Formmain0488> list);

    int updateBatchSelective(List<Formmain0488> list);

    int batchInsert(List<Formmain0488> list);

    int insertOrUpdate(Formmain0488 record);

    int insertOrUpdateSelective(Formmain0488 record);

}
