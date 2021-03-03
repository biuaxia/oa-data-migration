package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0067;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0067Service extends IService<Formmain0067> {


    int batchInsert(List<Formmain0067> list);

    int insertOrUpdate(Formmain0067 record);

    int insertOrUpdateSelective(Formmain0067 record);

}
