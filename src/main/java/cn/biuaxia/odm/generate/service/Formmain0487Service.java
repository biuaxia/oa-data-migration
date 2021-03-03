package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0487;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0487Service extends IService<Formmain0487> {


    int updateBatch(List<Formmain0487> list);

    int updateBatchSelective(List<Formmain0487> list);

    int batchInsert(List<Formmain0487> list);

    int insertOrUpdate(Formmain0487 record);

    int insertOrUpdateSelective(Formmain0487 record);

}
