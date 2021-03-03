package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0317;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0317Service extends IService<Formmain0317> {


    int updateBatch(List<Formmain0317> list);

    int updateBatchSelective(List<Formmain0317> list);

    int batchInsert(List<Formmain0317> list);

    int insertOrUpdate(Formmain0317 record);

    int insertOrUpdateSelective(Formmain0317 record);

}
