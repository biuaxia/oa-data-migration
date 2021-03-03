package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0526;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0526Service extends IService<Formmain0526> {


    int updateBatch(List<Formmain0526> list);

    int updateBatchSelective(List<Formmain0526> list);

    int batchInsert(List<Formmain0526> list);

    int insertOrUpdate(Formmain0526 record);

    int insertOrUpdateSelective(Formmain0526 record);

}
