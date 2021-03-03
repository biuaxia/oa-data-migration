package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0047;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0047Service extends IService<Formmain0047> {


    int batchInsert(List<Formmain0047> list);

    int insertOrUpdate(Formmain0047 record);

    int insertOrUpdateSelective(Formmain0047 record);

}
