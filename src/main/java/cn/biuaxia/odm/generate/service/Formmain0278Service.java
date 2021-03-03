package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0278;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0278Service extends IService<Formmain0278> {


    int updateBatch(List<Formmain0278> list);

    int updateBatchSelective(List<Formmain0278> list);

    int batchInsert(List<Formmain0278> list);

    int insertOrUpdate(Formmain0278 record);

    int insertOrUpdateSelective(Formmain0278 record);

}
