package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0037;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0037Service extends IService<Formmain0037> {


    int batchInsert(List<Formmain0037> list);

    int insertOrUpdate(Formmain0037 record);

    int insertOrUpdateSelective(Formmain0037 record);

}
