package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0086;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0086Service extends IService<Formmain0086> {


    int batchInsert(List<Formmain0086> list);

    int insertOrUpdate(Formmain0086 record);

    int insertOrUpdateSelective(Formmain0086 record);

}
