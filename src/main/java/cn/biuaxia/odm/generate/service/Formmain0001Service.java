package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0001;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0001Service extends IService<Formmain0001> {


    int batchInsert(List<Formmain0001> list);

    int insertOrUpdate(Formmain0001 record);

    int insertOrUpdateSelective(Formmain0001 record);

}
