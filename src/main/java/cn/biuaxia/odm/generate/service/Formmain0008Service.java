package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0008;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0008Service extends IService<Formmain0008> {


    int batchInsert(List<Formmain0008> list);

    int insertOrUpdate(Formmain0008 record);

    int insertOrUpdateSelective(Formmain0008 record);

}
