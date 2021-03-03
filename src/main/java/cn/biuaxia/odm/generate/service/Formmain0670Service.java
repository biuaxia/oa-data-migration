package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0670;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0670Service extends IService<Formmain0670> {

    int updateBatch(List<Formmain0670> list);

    int updateBatchSelective(List<Formmain0670> list);

    int batchInsert(List<Formmain0670> list);

    int insertOrUpdate(Formmain0670 record);

    int insertOrUpdateSelective(Formmain0670 record);

}
