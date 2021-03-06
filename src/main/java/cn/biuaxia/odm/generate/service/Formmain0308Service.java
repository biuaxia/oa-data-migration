package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0308;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0308Service extends IService<Formmain0308> {

    int updateBatch(List<Formmain0308> list);

    int updateBatchSelective(List<Formmain0308> list);

    int batchInsert(List<Formmain0308> list);

    int insertOrUpdate(Formmain0308 record);

    int insertOrUpdateSelective(Formmain0308 record);

}
