package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0099;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0099Service extends IService<Formmain0099> {


    int batchInsert(List<Formmain0099> list);

    int insertOrUpdate(Formmain0099 record);

    int insertOrUpdateSelective(Formmain0099 record);

}
