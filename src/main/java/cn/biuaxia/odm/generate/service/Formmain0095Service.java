package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0095;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0095Service extends IService<Formmain0095> {


    int batchInsert(List<Formmain0095> list);

    int insertOrUpdate(Formmain0095 record);

    int insertOrUpdateSelective(Formmain0095 record);

}
