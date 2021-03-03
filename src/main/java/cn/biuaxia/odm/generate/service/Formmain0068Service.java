package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0068;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0068Service extends IService<Formmain0068> {


    int batchInsert(List<Formmain0068> list);

    int insertOrUpdate(Formmain0068 record);

    int insertOrUpdateSelective(Formmain0068 record);

}
