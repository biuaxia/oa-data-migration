package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0176;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0176Service extends IService<Formmain0176> {

    int updateBatch(List<Formmain0176> list);

    int updateBatchSelective(List<Formmain0176> list);

    int batchInsert(List<Formmain0176> list);

    int insertOrUpdate(Formmain0176 record);

    int insertOrUpdateSelective(Formmain0176 record);

}
