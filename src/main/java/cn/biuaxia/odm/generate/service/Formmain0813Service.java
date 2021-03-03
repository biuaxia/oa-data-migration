package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0813;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0813Service extends IService<Formmain0813> {


    int updateBatch(List<Formmain0813> list);

    int updateBatchSelective(List<Formmain0813> list);

    int batchInsert(List<Formmain0813> list);

    int insertOrUpdate(Formmain0813 record);

    int insertOrUpdateSelective(Formmain0813 record);

}
