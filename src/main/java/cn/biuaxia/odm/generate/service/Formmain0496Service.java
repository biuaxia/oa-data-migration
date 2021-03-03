package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0496;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0496Service extends IService<Formmain0496> {


    int updateBatch(List<Formmain0496> list);

    int updateBatchSelective(List<Formmain0496> list);

    int batchInsert(List<Formmain0496> list);

    int insertOrUpdate(Formmain0496 record);

    int insertOrUpdateSelective(Formmain0496 record);

}
