package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0305;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0305Service extends IService<Formmain0305> {


    int updateBatch(List<Formmain0305> list);

    int updateBatchSelective(List<Formmain0305> list);

    int batchInsert(List<Formmain0305> list);

    int insertOrUpdate(Formmain0305 record);

    int insertOrUpdateSelective(Formmain0305 record);

}
