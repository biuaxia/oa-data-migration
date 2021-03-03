package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0124;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0124Service extends IService<Formmain0124> {


    int batchInsert(List<Formmain0124> list);

    int insertOrUpdate(Formmain0124 record);

    int insertOrUpdateSelective(Formmain0124 record);

}
