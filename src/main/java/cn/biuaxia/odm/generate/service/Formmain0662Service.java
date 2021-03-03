package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0662;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0662Service extends IService<Formmain0662> {


    int updateBatch(List<Formmain0662> list);

    int updateBatchSelective(List<Formmain0662> list);

    int batchInsert(List<Formmain0662> list);

    int insertOrUpdate(Formmain0662 record);

    int insertOrUpdateSelective(Formmain0662 record);

}
