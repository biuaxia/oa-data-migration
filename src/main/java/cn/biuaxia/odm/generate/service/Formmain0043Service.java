package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0043;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0043Service extends IService<Formmain0043> {


    int updateBatch(List<Formmain0043> list);

    int updateBatchSelective(List<Formmain0043> list);

    int batchInsert(List<Formmain0043> list);

    int insertOrUpdate(Formmain0043 record);

    int insertOrUpdateSelective(Formmain0043 record);

}
