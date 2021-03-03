package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0803;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0803Service extends IService<Formmain0803> {


    int updateBatch(List<Formmain0803> list);

    int updateBatchSelective(List<Formmain0803> list);

    int batchInsert(List<Formmain0803> list);

    int insertOrUpdate(Formmain0803 record);

    int insertOrUpdateSelective(Formmain0803 record);

}
