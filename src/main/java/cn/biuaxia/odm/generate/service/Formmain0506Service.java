package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0506;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0506Service extends IService<Formmain0506> {

    int updateBatch(List<Formmain0506> list);

    int updateBatchSelective(List<Formmain0506> list);

    int batchInsert(List<Formmain0506> list);

    int insertOrUpdate(Formmain0506 record);

    int insertOrUpdateSelective(Formmain0506 record);

}
