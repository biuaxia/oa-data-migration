package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0026;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0026Service extends IService<Formmain0026> {


    int updateBatch(List<Formmain0026> list);

    int updateBatchSelective(List<Formmain0026> list);

    int batchInsert(List<Formmain0026> list);

    int insertOrUpdate(Formmain0026 record);

    int insertOrUpdateSelective(Formmain0026 record);

}
