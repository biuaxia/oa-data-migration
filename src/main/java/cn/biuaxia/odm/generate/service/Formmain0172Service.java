package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0172;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0172Service extends IService<Formmain0172> {

    int updateBatch(List<Formmain0172> list);

    int updateBatchSelective(List<Formmain0172> list);

    int batchInsert(List<Formmain0172> list);

    int insertOrUpdate(Formmain0172 record);

    int insertOrUpdateSelective(Formmain0172 record);

}
