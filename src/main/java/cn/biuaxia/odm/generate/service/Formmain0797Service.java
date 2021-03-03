package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0797;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0797Service extends IService<Formmain0797> {

    int updateBatch(List<Formmain0797> list);

    int updateBatchSelective(List<Formmain0797> list);

    int batchInsert(List<Formmain0797> list);

    int insertOrUpdate(Formmain0797 record);

    int insertOrUpdateSelective(Formmain0797 record);

}
