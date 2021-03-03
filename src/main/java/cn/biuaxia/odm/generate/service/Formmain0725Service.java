package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0725;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0725Service extends IService<Formmain0725> {


    int updateBatch(List<Formmain0725> list);

    int updateBatchSelective(List<Formmain0725> list);

    int batchInsert(List<Formmain0725> list);

    int insertOrUpdate(Formmain0725 record);

    int insertOrUpdateSelective(Formmain0725 record);

}
