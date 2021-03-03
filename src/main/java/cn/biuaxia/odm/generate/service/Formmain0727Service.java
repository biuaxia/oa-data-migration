package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0727;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0727Service extends IService<Formmain0727> {


    int updateBatch(List<Formmain0727> list);

    int updateBatchSelective(List<Formmain0727> list);

    int batchInsert(List<Formmain0727> list);

    int insertOrUpdate(Formmain0727 record);

    int insertOrUpdateSelective(Formmain0727 record);

}
