package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0657;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0657Service extends IService<Formmain0657> {

    int updateBatch(List<Formmain0657> list);

    int updateBatchSelective(List<Formmain0657> list);

    int batchInsert(List<Formmain0657> list);

    int insertOrUpdate(Formmain0657 record);

    int insertOrUpdateSelective(Formmain0657 record);

}
