package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0729;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0729Service extends IService<Formmain0729> {


    int updateBatch(List<Formmain0729> list);

    int updateBatchSelective(List<Formmain0729> list);

    int batchInsert(List<Formmain0729> list);

    int insertOrUpdate(Formmain0729 record);

    int insertOrUpdateSelective(Formmain0729 record);

}
