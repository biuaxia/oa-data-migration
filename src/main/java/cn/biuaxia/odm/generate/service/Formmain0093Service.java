package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0093;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0093Service extends IService<Formmain0093> {

    int batchInsert(List<Formmain0093> list);

    int insertOrUpdate(Formmain0093 record);

    int insertOrUpdateSelective(Formmain0093 record);

}
