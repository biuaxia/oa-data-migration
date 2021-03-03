package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0705;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0705Service extends IService<Formmain0705> {

    int updateBatch(List<Formmain0705> list);

    int updateBatchSelective(List<Formmain0705> list);

    int batchInsert(List<Formmain0705> list);

    int insertOrUpdate(Formmain0705 record);

    int insertOrUpdateSelective(Formmain0705 record);

}
