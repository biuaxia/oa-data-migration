package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0070;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0070Service extends IService<Formmain0070> {


    int batchInsert(List<Formmain0070> list);

    int insertOrUpdate(Formmain0070 record);

    int insertOrUpdateSelective(Formmain0070 record);

}
