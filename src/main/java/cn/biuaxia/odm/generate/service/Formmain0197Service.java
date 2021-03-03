package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0197;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0197Service extends IService<Formmain0197> {

    int updateBatch(List<Formmain0197> list);

    int updateBatchSelective(List<Formmain0197> list);

    int batchInsert(List<Formmain0197> list);

    int insertOrUpdate(Formmain0197 record);

    int insertOrUpdateSelective(Formmain0197 record);

}
