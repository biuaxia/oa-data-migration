package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0314;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0314Service extends IService<Formmain0314> {

    int updateBatch(List<Formmain0314> list);

    int updateBatchSelective(List<Formmain0314> list);

    int batchInsert(List<Formmain0314> list);

    int insertOrUpdate(Formmain0314 record);

    int insertOrUpdateSelective(Formmain0314 record);

}
