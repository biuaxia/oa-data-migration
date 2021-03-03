package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0703;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0703Service extends IService<Formmain0703> {


    int updateBatch(List<Formmain0703> list);

    int updateBatchSelective(List<Formmain0703> list);

    int batchInsert(List<Formmain0703> list);

    int insertOrUpdate(Formmain0703 record);

    int insertOrUpdateSelective(Formmain0703 record);

}
