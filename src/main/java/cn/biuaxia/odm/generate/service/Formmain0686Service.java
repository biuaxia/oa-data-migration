package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0686;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0686Service extends IService<Formmain0686> {

    int updateBatch(List<Formmain0686> list);

    int updateBatchSelective(List<Formmain0686> list);

    int batchInsert(List<Formmain0686> list);

    int insertOrUpdate(Formmain0686 record);

    int insertOrUpdateSelective(Formmain0686 record);

}
