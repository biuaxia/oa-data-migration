package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0745;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0745Service extends IService<Formmain0745> {


    int updateBatch(List<Formmain0745> list);

    int updateBatchSelective(List<Formmain0745> list);

    int batchInsert(List<Formmain0745> list);

    int insertOrUpdate(Formmain0745 record);

    int insertOrUpdateSelective(Formmain0745 record);

}
