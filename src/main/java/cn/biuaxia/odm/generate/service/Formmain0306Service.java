package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0306;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0306Service extends IService<Formmain0306> {

    int updateBatch(List<Formmain0306> list);

    int updateBatchSelective(List<Formmain0306> list);

    int batchInsert(List<Formmain0306> list);

    int insertOrUpdate(Formmain0306 record);

    int insertOrUpdateSelective(Formmain0306 record);

}
