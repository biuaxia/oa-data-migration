package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0687;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0687Service extends IService<Formmain0687> {

    int updateBatch(List<Formmain0687> list);

    int updateBatchSelective(List<Formmain0687> list);

    int batchInsert(List<Formmain0687> list);

    int insertOrUpdate(Formmain0687 record);

    int insertOrUpdateSelective(Formmain0687 record);

}
