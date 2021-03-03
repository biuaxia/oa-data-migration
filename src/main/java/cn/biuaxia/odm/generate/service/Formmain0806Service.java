package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0806;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0806Service extends IService<Formmain0806> {

    int updateBatch(List<Formmain0806> list);

    int updateBatchSelective(List<Formmain0806> list);

    int batchInsert(List<Formmain0806> list);

    int insertOrUpdate(Formmain0806 record);

    int insertOrUpdateSelective(Formmain0806 record);

}
