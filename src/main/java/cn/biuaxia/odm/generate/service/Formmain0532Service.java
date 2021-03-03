package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0532;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0532Service extends IService<Formmain0532> {

    int updateBatch(List<Formmain0532> list);

    int updateBatchSelective(List<Formmain0532> list);

    int batchInsert(List<Formmain0532> list);

    int insertOrUpdate(Formmain0532 record);

    int insertOrUpdateSelective(Formmain0532 record);

}
