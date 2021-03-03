package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0847;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0847Service extends IService<Formmain0847> {


    int updateBatch(List<Formmain0847> list);

    int updateBatchSelective(List<Formmain0847> list);

    int batchInsert(List<Formmain0847> list);

    int insertOrUpdate(Formmain0847 record);

    int insertOrUpdateSelective(Formmain0847 record);

}
