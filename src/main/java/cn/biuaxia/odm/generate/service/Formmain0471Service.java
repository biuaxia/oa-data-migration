package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0471;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0471Service extends IService<Formmain0471> {

    int updateBatch(List<Formmain0471> list);

    int updateBatchSelective(List<Formmain0471> list);

    int batchInsert(List<Formmain0471> list);

    int insertOrUpdate(Formmain0471 record);

    int insertOrUpdateSelective(Formmain0471 record);

}
