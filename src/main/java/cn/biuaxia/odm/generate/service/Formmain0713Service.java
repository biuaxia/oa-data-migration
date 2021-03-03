package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0713;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0713Service extends IService<Formmain0713> {


    int updateBatch(List<Formmain0713> list);

    int updateBatchSelective(List<Formmain0713> list);

    int batchInsert(List<Formmain0713> list);

    int insertOrUpdate(Formmain0713 record);

    int insertOrUpdateSelective(Formmain0713 record);

}
