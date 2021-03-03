package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0659;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0659Service extends IService<Formmain0659> {

    int updateBatch(List<Formmain0659> list);

    int updateBatchSelective(List<Formmain0659> list);

    int batchInsert(List<Formmain0659> list);

    int insertOrUpdate(Formmain0659 record);

    int insertOrUpdateSelective(Formmain0659 record);

}
