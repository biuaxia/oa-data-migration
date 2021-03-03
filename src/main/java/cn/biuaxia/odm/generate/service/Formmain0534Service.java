package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0534;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0534Service extends IService<Formmain0534> {

    int updateBatch(List<Formmain0534> list);

    int updateBatchSelective(List<Formmain0534> list);

    int batchInsert(List<Formmain0534> list);

    int insertOrUpdate(Formmain0534 record);

    int insertOrUpdateSelective(Formmain0534 record);

}
