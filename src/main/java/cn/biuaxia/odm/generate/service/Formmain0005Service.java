package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0005;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0005Service extends IService<Formmain0005> {

    int batchInsert(List<Formmain0005> list);

    int insertOrUpdate(Formmain0005 record);

    int insertOrUpdateSelective(Formmain0005 record);

}
