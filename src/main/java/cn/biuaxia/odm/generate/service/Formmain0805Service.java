package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0805;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0805Service extends IService<Formmain0805> {


    int updateBatch(List<Formmain0805> list);

    int updateBatchSelective(List<Formmain0805> list);

    int batchInsert(List<Formmain0805> list);

    int insertOrUpdate(Formmain0805 record);

    int insertOrUpdateSelective(Formmain0805 record);

}
