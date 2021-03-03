package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0756;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0756Service extends IService<Formmain0756> {


    int updateBatch(List<Formmain0756> list);

    int updateBatchSelective(List<Formmain0756> list);

    int batchInsert(List<Formmain0756> list);

    int insertOrUpdate(Formmain0756 record);

    int insertOrUpdateSelective(Formmain0756 record);

}
