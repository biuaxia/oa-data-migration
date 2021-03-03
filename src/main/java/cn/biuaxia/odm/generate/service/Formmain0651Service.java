package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0651;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0651Service extends IService<Formmain0651> {

    int updateBatch(List<Formmain0651> list);

    int updateBatchSelective(List<Formmain0651> list);

    int batchInsert(List<Formmain0651> list);

    int insertOrUpdate(Formmain0651 record);

    int insertOrUpdateSelective(Formmain0651 record);

}
