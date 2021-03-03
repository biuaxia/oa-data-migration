package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0758;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0758Service extends IService<Formmain0758> {


    int updateBatch(List<Formmain0758> list);

    int updateBatchSelective(List<Formmain0758> list);

    int batchInsert(List<Formmain0758> list);

    int insertOrUpdate(Formmain0758 record);

    int insertOrUpdateSelective(Formmain0758 record);

}
