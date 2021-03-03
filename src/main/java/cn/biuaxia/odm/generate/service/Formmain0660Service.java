package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0660;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0660Service extends IService<Formmain0660> {

    int updateBatch(List<Formmain0660> list);

    int updateBatchSelective(List<Formmain0660> list);

    int batchInsert(List<Formmain0660> list);

    int insertOrUpdate(Formmain0660 record);

    int insertOrUpdateSelective(Formmain0660 record);

}
