package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0005;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0005Service extends IService<Formmain0005> {


    int batchInsert(List<Formmain0005> list);

    int insertOrUpdate(Formmain0005 record);

    int insertOrUpdateSelective(Formmain0005 record);

}
