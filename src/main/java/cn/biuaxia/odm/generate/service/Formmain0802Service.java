package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0802;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0802Service extends IService<Formmain0802> {


    int updateBatch(List<Formmain0802> list);

    int updateBatchSelective(List<Formmain0802> list);

    int batchInsert(List<Formmain0802> list);

    int insertOrUpdate(Formmain0802 record);

    int insertOrUpdateSelective(Formmain0802 record);

}
