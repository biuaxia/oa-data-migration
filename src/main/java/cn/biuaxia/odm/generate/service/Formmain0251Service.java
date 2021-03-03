package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0251;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0251Service extends IService<Formmain0251> {

    int updateBatch(List<Formmain0251> list);

    int updateBatchSelective(List<Formmain0251> list);

    int batchInsert(List<Formmain0251> list);

    int insertOrUpdate(Formmain0251 record);

    int insertOrUpdateSelective(Formmain0251 record);

}
