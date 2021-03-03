package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0028;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0028Service extends IService<Formmain0028> {


    int batchInsert(List<Formmain0028> list);

    int insertOrUpdate(Formmain0028 record);

    int insertOrUpdateSelective(Formmain0028 record);

}
