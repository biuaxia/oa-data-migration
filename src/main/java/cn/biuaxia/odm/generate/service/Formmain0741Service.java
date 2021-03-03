package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0741;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0741Service extends IService<Formmain0741> {

    int updateBatch(List<Formmain0741> list);

    int updateBatchSelective(List<Formmain0741> list);

    int batchInsert(List<Formmain0741> list);

    int insertOrUpdate(Formmain0741 record);

    int insertOrUpdateSelective(Formmain0741 record);

}
