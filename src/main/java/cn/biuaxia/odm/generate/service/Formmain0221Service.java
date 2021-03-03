package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0221;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0221Service extends IService<Formmain0221> {

    int updateBatch(List<Formmain0221> list);

    int updateBatchSelective(List<Formmain0221> list);

    int batchInsert(List<Formmain0221> list);

    int insertOrUpdate(Formmain0221 record);

    int insertOrUpdateSelective(Formmain0221 record);

}
