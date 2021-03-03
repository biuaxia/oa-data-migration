package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0004;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0004Service extends IService<Formmain0004> {

    int batchInsert(List<Formmain0004> list);

    int insertOrUpdate(Formmain0004 record);

    int insertOrUpdateSelective(Formmain0004 record);

}
