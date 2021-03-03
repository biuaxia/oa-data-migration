package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0045;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0045Service extends IService<Formmain0045> {


    int batchInsert(List<Formmain0045> list);

    int insertOrUpdate(Formmain0045 record);

    int insertOrUpdateSelective(Formmain0045 record);

}
