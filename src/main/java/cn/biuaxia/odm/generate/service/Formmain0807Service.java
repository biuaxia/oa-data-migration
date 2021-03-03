package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0807;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0807Service extends IService<Formmain0807> {


    int updateBatch(List<Formmain0807> list);

    int updateBatchSelective(List<Formmain0807> list);

    int batchInsert(List<Formmain0807> list);

    int insertOrUpdate(Formmain0807 record);

    int insertOrUpdateSelective(Formmain0807 record);

}
