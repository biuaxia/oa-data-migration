package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0083;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0083Service extends IService<Formmain0083> {


    int batchInsert(List<Formmain0083> list);

    int insertOrUpdate(Formmain0083 record);

    int insertOrUpdateSelective(Formmain0083 record);

}
