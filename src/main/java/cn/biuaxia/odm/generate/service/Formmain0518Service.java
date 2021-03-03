package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0518;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0518Service extends IService<Formmain0518> {


    int updateBatch(List<Formmain0518> list);

    int updateBatchSelective(List<Formmain0518> list);

    int batchInsert(List<Formmain0518> list);

    int insertOrUpdate(Formmain0518 record);

    int insertOrUpdateSelective(Formmain0518 record);

}
