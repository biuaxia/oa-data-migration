package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0725;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0725Service extends IService<Formmain0725> {

    int updateBatch(List<Formmain0725> list);

    int updateBatchSelective(List<Formmain0725> list);

    int batchInsert(List<Formmain0725> list);

    int insertOrUpdate(Formmain0725 record);

    int insertOrUpdateSelective(Formmain0725 record);

}
