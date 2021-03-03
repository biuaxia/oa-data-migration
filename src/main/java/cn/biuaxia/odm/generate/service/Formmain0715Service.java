package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0715;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0715Service extends IService<Formmain0715> {

    int updateBatch(List<Formmain0715> list);

    int updateBatchSelective(List<Formmain0715> list);

    int batchInsert(List<Formmain0715> list);

    int insertOrUpdate(Formmain0715 record);

    int insertOrUpdateSelective(Formmain0715 record);

}
