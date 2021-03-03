package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0782;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0782Service extends IService<Formmain0782> {


    int updateBatch(List<Formmain0782> list);

    int updateBatchSelective(List<Formmain0782> list);

    int batchInsert(List<Formmain0782> list);

    int insertOrUpdate(Formmain0782 record);

    int insertOrUpdateSelective(Formmain0782 record);

}
