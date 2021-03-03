package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0531;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0531Service extends IService<Formmain0531> {

    int updateBatch(List<Formmain0531> list);

    int updateBatchSelective(List<Formmain0531> list);

    int batchInsert(List<Formmain0531> list);

    int insertOrUpdate(Formmain0531 record);

    int insertOrUpdateSelective(Formmain0531 record);

}
