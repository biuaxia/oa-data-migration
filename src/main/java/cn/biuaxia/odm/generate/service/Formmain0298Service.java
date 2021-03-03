package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0298;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0298Service extends IService<Formmain0298> {

    int updateBatch(List<Formmain0298> list);

    int updateBatchSelective(List<Formmain0298> list);

    int batchInsert(List<Formmain0298> list);

    int insertOrUpdate(Formmain0298 record);

    int insertOrUpdateSelective(Formmain0298 record);

}
