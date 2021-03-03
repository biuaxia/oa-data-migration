package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0095;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0095Service extends IService<Formmain0095> {

    int batchInsert(List<Formmain0095> list);

    int insertOrUpdate(Formmain0095 record);

    int insertOrUpdateSelective(Formmain0095 record);

}
