package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0207;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0207Service extends IService<Formmain0207> {


    int updateBatch(List<Formmain0207> list);

    int updateBatchSelective(List<Formmain0207> list);

    int batchInsert(List<Formmain0207> list);

    int insertOrUpdate(Formmain0207 record);

    int insertOrUpdateSelective(Formmain0207 record);

}
