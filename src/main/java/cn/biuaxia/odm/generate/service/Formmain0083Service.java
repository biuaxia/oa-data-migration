package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0083;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0083Service extends IService<Formmain0083> {

    int batchInsert(List<Formmain0083> list);

    int insertOrUpdate(Formmain0083 record);

    int insertOrUpdateSelective(Formmain0083 record);

}
