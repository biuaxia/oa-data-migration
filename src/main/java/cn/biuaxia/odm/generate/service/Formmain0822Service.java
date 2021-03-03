package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0822;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0822Service extends IService<Formmain0822> {


    int updateBatch(List<Formmain0822> list);

    int updateBatchSelective(List<Formmain0822> list);

    int batchInsert(List<Formmain0822> list);

    int insertOrUpdate(Formmain0822 record);

    int insertOrUpdateSelective(Formmain0822 record);

}
