package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0870;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0870Service extends IService<Formmain0870> {


    int updateBatch(List<Formmain0870> list);

    int updateBatchSelective(List<Formmain0870> list);

    int batchInsert(List<Formmain0870> list);

    int insertOrUpdate(Formmain0870 record);

    int insertOrUpdateSelective(Formmain0870 record);

}
