package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0801;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0801Service extends IService<Formmain0801> {


    int updateBatch(List<Formmain0801> list);

    int updateBatchSelective(List<Formmain0801> list);

    int batchInsert(List<Formmain0801> list);

    int insertOrUpdate(Formmain0801 record);

    int insertOrUpdateSelective(Formmain0801 record);

}
