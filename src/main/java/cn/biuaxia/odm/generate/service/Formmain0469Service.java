package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0469;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0469Service extends IService<Formmain0469> {

    int updateBatch(List<Formmain0469> list);

    int updateBatchSelective(List<Formmain0469> list);

    int batchInsert(List<Formmain0469> list);

    int insertOrUpdate(Formmain0469 record);

    int insertOrUpdateSelective(Formmain0469 record);

}
