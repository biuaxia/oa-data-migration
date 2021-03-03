package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0003;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0003Service extends IService<Formmain0003> {


    int batchInsert(List<Formmain0003> list);

    int insertOrUpdate(Formmain0003 record);

    int insertOrUpdateSelective(Formmain0003 record);

}
