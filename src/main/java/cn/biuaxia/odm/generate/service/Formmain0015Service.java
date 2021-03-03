package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0015;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0015Service extends IService<Formmain0015> {

    int batchInsert(List<Formmain0015> list);

    int insertOrUpdate(Formmain0015 record);

    int insertOrUpdateSelective(Formmain0015 record);

}
