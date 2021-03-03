package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0774;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0774Service extends IService<Formmain0774> {


    int updateBatch(List<Formmain0774> list);

    int updateBatchSelective(List<Formmain0774> list);

    int batchInsert(List<Formmain0774> list);

    int insertOrUpdate(Formmain0774 record);

    int insertOrUpdateSelective(Formmain0774 record);

}
