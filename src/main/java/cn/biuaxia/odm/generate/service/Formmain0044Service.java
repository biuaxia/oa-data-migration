package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0044;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0044Service extends IService<Formmain0044> {

    int updateBatch(List<Formmain0044> list);

    int updateBatchSelective(List<Formmain0044> list);

    int batchInsert(List<Formmain0044> list);

    int insertOrUpdate(Formmain0044 record);

    int insertOrUpdateSelective(Formmain0044 record);

}
