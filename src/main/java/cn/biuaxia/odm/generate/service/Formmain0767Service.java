package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0767;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0767Service extends IService<Formmain0767> {

    int updateBatch(List<Formmain0767> list);

    int updateBatchSelective(List<Formmain0767> list);

    int batchInsert(List<Formmain0767> list);

    int insertOrUpdate(Formmain0767 record);

    int insertOrUpdateSelective(Formmain0767 record);

}
