package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0731;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0731Service extends IService<Formmain0731> {

    int updateBatch(List<Formmain0731> list);

    int updateBatchSelective(List<Formmain0731> list);

    int batchInsert(List<Formmain0731> list);

    int insertOrUpdate(Formmain0731 record);

    int insertOrUpdateSelective(Formmain0731 record);

}
