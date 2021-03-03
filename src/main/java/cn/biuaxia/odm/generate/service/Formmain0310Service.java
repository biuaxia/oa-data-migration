package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0310;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0310Service extends IService<Formmain0310> {


    int updateBatch(List<Formmain0310> list);

    int updateBatchSelective(List<Formmain0310> list);

    int batchInsert(List<Formmain0310> list);

    int insertOrUpdate(Formmain0310 record);

    int insertOrUpdateSelective(Formmain0310 record);

}
