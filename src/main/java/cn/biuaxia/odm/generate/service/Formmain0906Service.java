package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0906;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0906Service extends IService<Formmain0906> {


    int updateBatch(List<Formmain0906> list);

    int updateBatchSelective(List<Formmain0906> list);

    int batchInsert(List<Formmain0906> list);

    int insertOrUpdate(Formmain0906 record);

    int insertOrUpdateSelective(Formmain0906 record);

}
