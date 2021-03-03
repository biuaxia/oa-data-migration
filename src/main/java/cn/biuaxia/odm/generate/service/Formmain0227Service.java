package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0227;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0227Service extends IService<Formmain0227> {

    int updateBatch(List<Formmain0227> list);

    int updateBatchSelective(List<Formmain0227> list);

    int batchInsert(List<Formmain0227> list);

    int insertOrUpdate(Formmain0227 record);

    int insertOrUpdateSelective(Formmain0227 record);

}
