package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0716;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0716Service extends IService<Formmain0716> {

    int updateBatch(List<Formmain0716> list);

    int updateBatchSelective(List<Formmain0716> list);

    int batchInsert(List<Formmain0716> list);

    int insertOrUpdate(Formmain0716 record);

    int insertOrUpdateSelective(Formmain0716 record);

}
