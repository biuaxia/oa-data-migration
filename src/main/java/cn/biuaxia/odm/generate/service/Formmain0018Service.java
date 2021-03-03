package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0018;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0018Service extends IService<Formmain0018> {

    int batchInsert(List<Formmain0018> list);

    int insertOrUpdate(Formmain0018 record);

    int insertOrUpdateSelective(Formmain0018 record);

}
