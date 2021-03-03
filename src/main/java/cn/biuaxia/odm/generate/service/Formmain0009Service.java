package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0009;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0009Service extends IService<Formmain0009> {


    int batchInsert(List<Formmain0009> list);

    int insertOrUpdate(Formmain0009 record);

    int insertOrUpdateSelective(Formmain0009 record);

}
