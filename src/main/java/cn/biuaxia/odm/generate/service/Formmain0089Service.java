package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0089;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0089Service extends IService<Formmain0089> {


    int batchInsert(List<Formmain0089> list);

    int insertOrUpdate(Formmain0089 record);

    int insertOrUpdateSelective(Formmain0089 record);

}
