package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0785;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0785Service extends IService<Formmain0785> {

    int updateBatch(List<Formmain0785> list);

    int updateBatchSelective(List<Formmain0785> list);

    int batchInsert(List<Formmain0785> list);

    int insertOrUpdate(Formmain0785 record);

    int insertOrUpdateSelective(Formmain0785 record);

}
