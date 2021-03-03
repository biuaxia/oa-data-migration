package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0012;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0012Service extends IService<Formmain0012> {


    int batchInsert(List<Formmain0012> list);

    int insertOrUpdate(Formmain0012 record);

    int insertOrUpdateSelective(Formmain0012 record);

}
