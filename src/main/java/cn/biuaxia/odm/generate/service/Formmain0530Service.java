package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0530;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0530Service extends IService<Formmain0530> {

    int updateBatch(List<Formmain0530> list);

    int updateBatchSelective(List<Formmain0530> list);

    int batchInsert(List<Formmain0530> list);

    int insertOrUpdate(Formmain0530 record);

    int insertOrUpdateSelective(Formmain0530 record);

}
