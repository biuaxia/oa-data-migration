package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0015;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0015Service extends IService<Formmain0015> {


    int batchInsert(List<Formmain0015> list);

    int insertOrUpdate(Formmain0015 record);

    int insertOrUpdateSelective(Formmain0015 record);

}
