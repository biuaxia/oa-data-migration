package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0267;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0267Service extends IService<Formmain0267> {

    int updateBatch(List<Formmain0267> list);

    int updateBatchSelective(List<Formmain0267> list);

    int batchInsert(List<Formmain0267> list);

    int insertOrUpdate(Formmain0267 record);

    int insertOrUpdateSelective(Formmain0267 record);

}
