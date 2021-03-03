package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0234;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0234Service extends IService<Formmain0234> {

    int updateBatch(List<Formmain0234> list);

    int updateBatchSelective(List<Formmain0234> list);

    int batchInsert(List<Formmain0234> list);

    int insertOrUpdate(Formmain0234 record);

    int insertOrUpdateSelective(Formmain0234 record);

}
