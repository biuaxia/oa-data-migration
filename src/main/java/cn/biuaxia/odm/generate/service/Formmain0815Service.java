package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0815;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0815Service extends IService<Formmain0815> {

    int updateBatch(List<Formmain0815> list);

    int updateBatchSelective(List<Formmain0815> list);

    int batchInsert(List<Formmain0815> list);

    int insertOrUpdate(Formmain0815 record);

    int insertOrUpdateSelective(Formmain0815 record);

}
