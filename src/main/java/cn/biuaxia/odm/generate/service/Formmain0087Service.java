package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0087;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0087Service extends IService<Formmain0087> {


    int batchInsert(List<Formmain0087> list);

    int insertOrUpdate(Formmain0087 record);

    int insertOrUpdateSelective(Formmain0087 record);

}
