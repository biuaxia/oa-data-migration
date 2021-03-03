package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0302;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0302Service extends IService<Formmain0302> {

    int updateBatch(List<Formmain0302> list);

    int updateBatchSelective(List<Formmain0302> list);

    int batchInsert(List<Formmain0302> list);

    int insertOrUpdate(Formmain0302 record);

    int insertOrUpdateSelective(Formmain0302 record);

}
