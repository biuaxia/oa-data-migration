package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0508;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0508Service extends IService<Formmain0508> {

    int updateBatch(List<Formmain0508> list);

    int updateBatchSelective(List<Formmain0508> list);

    int batchInsert(List<Formmain0508> list);

    int insertOrUpdate(Formmain0508 record);

    int insertOrUpdateSelective(Formmain0508 record);

}
