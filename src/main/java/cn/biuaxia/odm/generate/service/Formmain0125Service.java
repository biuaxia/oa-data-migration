package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0125;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0125Service extends IService<Formmain0125> {


    int batchInsert(List<Formmain0125> list);

    int insertOrUpdate(Formmain0125 record);

    int insertOrUpdateSelective(Formmain0125 record);

}
