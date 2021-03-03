package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0244;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0244Service extends IService<Formmain0244> {


    int updateBatch(List<Formmain0244> list);

    int updateBatchSelective(List<Formmain0244> list);

    int batchInsert(List<Formmain0244> list);

    int insertOrUpdate(Formmain0244 record);

    int insertOrUpdateSelective(Formmain0244 record);

}
