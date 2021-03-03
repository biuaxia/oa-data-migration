package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0067;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0067Service extends IService<Formmain0067> {

    int batchInsert(List<Formmain0067> list);

    int insertOrUpdate(Formmain0067 record);

    int insertOrUpdateSelective(Formmain0067 record);

}
