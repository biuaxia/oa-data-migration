package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0014;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0014Service extends IService<Formmain0014> {


    int batchInsert(List<Formmain0014> list);

    int insertOrUpdate(Formmain0014 record);

    int insertOrUpdateSelective(Formmain0014 record);

}
