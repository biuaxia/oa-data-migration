package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0310;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0310Service extends IService<Formmain0310> {

    int updateBatch(List<Formmain0310> list);

    int updateBatchSelective(List<Formmain0310> list);

    int batchInsert(List<Formmain0310> list);

    int insertOrUpdate(Formmain0310 record);

    int insertOrUpdateSelective(Formmain0310 record);

}
