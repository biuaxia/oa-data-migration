package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0279;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0279Service extends IService<Formmain0279> {


    int updateBatch(List<Formmain0279> list);

    int updateBatchSelective(List<Formmain0279> list);

    int batchInsert(List<Formmain0279> list);

    int insertOrUpdate(Formmain0279 record);

    int insertOrUpdateSelective(Formmain0279 record);

}
