package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0770;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0770Service extends IService<Formmain0770> {


    int updateBatch(List<Formmain0770> list);

    int updateBatchSelective(List<Formmain0770> list);

    int batchInsert(List<Formmain0770> list);

    int insertOrUpdate(Formmain0770 record);

    int insertOrUpdateSelective(Formmain0770 record);

}
