package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0715;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0715Service extends IService<Formmain0715> {


    int updateBatch(List<Formmain0715> list);

    int updateBatchSelective(List<Formmain0715> list);

    int batchInsert(List<Formmain0715> list);

    int insertOrUpdate(Formmain0715 record);

    int insertOrUpdateSelective(Formmain0715 record);

}
