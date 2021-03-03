package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0878;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0878Service extends IService<Formmain0878> {

    int updateBatch(List<Formmain0878> list);

    int updateBatchSelective(List<Formmain0878> list);

    int batchInsert(List<Formmain0878> list);

    int insertOrUpdate(Formmain0878 record);

    int insertOrUpdateSelective(Formmain0878 record);

}
