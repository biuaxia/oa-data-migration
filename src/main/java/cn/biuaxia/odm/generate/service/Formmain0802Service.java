package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0802;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0802Service extends IService<Formmain0802> {

    int updateBatch(List<Formmain0802> list);

    int updateBatchSelective(List<Formmain0802> list);

    int batchInsert(List<Formmain0802> list);

    int insertOrUpdate(Formmain0802 record);

    int insertOrUpdateSelective(Formmain0802 record);

}
