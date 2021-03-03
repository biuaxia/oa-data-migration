package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0862;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0862Service extends IService<Formmain0862> {


    int updateBatch(List<Formmain0862> list);

    int updateBatchSelective(List<Formmain0862> list);

    int batchInsert(List<Formmain0862> list);

    int insertOrUpdate(Formmain0862 record);

    int insertOrUpdateSelective(Formmain0862 record);

}
