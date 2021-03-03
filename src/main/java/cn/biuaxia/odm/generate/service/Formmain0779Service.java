package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0779;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0779Service extends IService<Formmain0779> {

    int updateBatch(List<Formmain0779> list);

    int updateBatchSelective(List<Formmain0779> list);

    int batchInsert(List<Formmain0779> list);

    int insertOrUpdate(Formmain0779 record);

    int insertOrUpdateSelective(Formmain0779 record);

}
