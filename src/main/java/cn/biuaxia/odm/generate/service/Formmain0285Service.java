package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0285;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0285Service extends IService<Formmain0285> {


    int updateBatch(List<Formmain0285> list);

    int updateBatchSelective(List<Formmain0285> list);

    int batchInsert(List<Formmain0285> list);

    int insertOrUpdate(Formmain0285 record);

    int insertOrUpdateSelective(Formmain0285 record);

}
