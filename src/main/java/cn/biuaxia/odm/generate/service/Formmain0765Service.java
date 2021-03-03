package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0765;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0765Service extends IService<Formmain0765> {

    int updateBatch(List<Formmain0765> list);

    int updateBatchSelective(List<Formmain0765> list);

    int batchInsert(List<Formmain0765> list);

    int insertOrUpdate(Formmain0765 record);

    int insertOrUpdateSelective(Formmain0765 record);

}
