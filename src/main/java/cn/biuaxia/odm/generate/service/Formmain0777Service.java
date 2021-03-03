package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0777;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0777Service extends IService<Formmain0777> {

    int updateBatch(List<Formmain0777> list);

    int updateBatchSelective(List<Formmain0777> list);

    int batchInsert(List<Formmain0777> list);

    int insertOrUpdate(Formmain0777 record);

    int insertOrUpdateSelective(Formmain0777 record);

}
