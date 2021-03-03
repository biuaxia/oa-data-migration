package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0122;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0122Service extends IService<Formmain0122> {

    int batchInsert(List<Formmain0122> list);

    int insertOrUpdate(Formmain0122 record);

    int insertOrUpdateSelective(Formmain0122 record);

}
