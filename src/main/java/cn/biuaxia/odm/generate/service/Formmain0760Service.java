package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0760;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0760Service extends IService<Formmain0760> {

    int updateBatch(List<Formmain0760> list);

    int updateBatchSelective(List<Formmain0760> list);

    int batchInsert(List<Formmain0760> list);

    int insertOrUpdate(Formmain0760 record);

    int insertOrUpdateSelective(Formmain0760 record);

}
