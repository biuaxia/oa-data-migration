package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0016;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0016Service extends IService<Formmain0016> {

    int batchInsert(List<Formmain0016> list);

    int insertOrUpdate(Formmain0016 record);

    int insertOrUpdateSelective(Formmain0016 record);

}
