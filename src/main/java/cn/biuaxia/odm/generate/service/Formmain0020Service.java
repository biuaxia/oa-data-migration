package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0020;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0020Service extends IService<Formmain0020> {

    int batchInsert(List<Formmain0020> list);

    int insertOrUpdate(Formmain0020 record);

    int insertOrUpdateSelective(Formmain0020 record);

}
