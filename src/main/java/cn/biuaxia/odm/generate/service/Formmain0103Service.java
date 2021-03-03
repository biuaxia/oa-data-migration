package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0103;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0103Service extends IService<Formmain0103> {


    int batchInsert(List<Formmain0103> list);

    int insertOrUpdate(Formmain0103 record);

    int insertOrUpdateSelective(Formmain0103 record);

}
