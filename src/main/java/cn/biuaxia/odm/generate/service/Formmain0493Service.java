package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0493;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0493Service extends IService<Formmain0493> {

    int updateBatch(List<Formmain0493> list);

    int updateBatchSelective(List<Formmain0493> list);

    int batchInsert(List<Formmain0493> list);

    int insertOrUpdate(Formmain0493 record);

    int insertOrUpdateSelective(Formmain0493 record);

}
