package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0063;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0063Service extends IService<Formmain0063> {

    int batchInsert(List<Formmain0063> list);

    int insertOrUpdate(Formmain0063 record);

    int insertOrUpdateSelective(Formmain0063 record);

}
