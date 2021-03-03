package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0162;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0162Service extends IService<Formmain0162> {


    int updateBatch(List<Formmain0162> list);

    int updateBatchSelective(List<Formmain0162> list);

    int batchInsert(List<Formmain0162> list);

    int insertOrUpdate(Formmain0162 record);

    int insertOrUpdateSelective(Formmain0162 record);

}
