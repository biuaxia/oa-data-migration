package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0286;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0286Service extends IService<Formmain0286> {


    int updateBatch(List<Formmain0286> list);

    int updateBatchSelective(List<Formmain0286> list);

    int batchInsert(List<Formmain0286> list);

    int insertOrUpdate(Formmain0286 record);

    int insertOrUpdateSelective(Formmain0286 record);

}
