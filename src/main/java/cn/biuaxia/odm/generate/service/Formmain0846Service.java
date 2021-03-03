package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0846;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0846Service extends IService<Formmain0846> {

    int updateBatch(List<Formmain0846> list);

    int updateBatchSelective(List<Formmain0846> list);

    int batchInsert(List<Formmain0846> list);

    int insertOrUpdate(Formmain0846 record);

    int insertOrUpdateSelective(Formmain0846 record);

}
