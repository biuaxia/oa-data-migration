package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0703;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0703Service extends IService<Formmain0703> {

    int updateBatch(List<Formmain0703> list);

    int updateBatchSelective(List<Formmain0703> list);

    int batchInsert(List<Formmain0703> list);

    int insertOrUpdate(Formmain0703 record);

    int insertOrUpdateSelective(Formmain0703 record);

}
