package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0036;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0036Service extends IService<Formmain0036> {

    int batchInsert(List<Formmain0036> list);

    int insertOrUpdate(Formmain0036 record);

    int insertOrUpdateSelective(Formmain0036 record);

}
