package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0019;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0019Service extends IService<Formmain0019> {


    int batchInsert(List<Formmain0019> list);

    int insertOrUpdate(Formmain0019 record);

    int insertOrUpdateSelective(Formmain0019 record);

}
