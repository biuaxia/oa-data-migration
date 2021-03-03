package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0069;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0069Service extends IService<Formmain0069> {

    int batchInsert(List<Formmain0069> list);

    int insertOrUpdate(Formmain0069 record);

    int insertOrUpdateSelective(Formmain0069 record);

}
