package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0026;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0026Service extends IService<Formmain0026> {

    int updateBatch(List<Formmain0026> list);

    int updateBatchSelective(List<Formmain0026> list);

    int batchInsert(List<Formmain0026> list);

    int insertOrUpdate(Formmain0026 record);

    int insertOrUpdateSelective(Formmain0026 record);

}
