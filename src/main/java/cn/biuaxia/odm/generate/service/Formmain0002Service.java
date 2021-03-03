package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0002;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0002Service extends IService<Formmain0002> {


    int batchInsert(List<Formmain0002> list);

    int insertOrUpdate(Formmain0002 record);

    int insertOrUpdateSelective(Formmain0002 record);

}
