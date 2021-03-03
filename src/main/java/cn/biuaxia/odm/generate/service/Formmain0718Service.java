package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0718;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0718Service extends IService<Formmain0718> {

    int updateBatch(List<Formmain0718> list);

    int updateBatchSelective(List<Formmain0718> list);

    int batchInsert(List<Formmain0718> list);

    int insertOrUpdate(Formmain0718 record);

    int insertOrUpdateSelective(Formmain0718 record);

}
