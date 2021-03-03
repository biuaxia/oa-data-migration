package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0064;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0064Service extends IService<Formmain0064> {


    int batchInsert(List<Formmain0064> list);

    int insertOrUpdate(Formmain0064 record);

    int insertOrUpdateSelective(Formmain0064 record);

}
