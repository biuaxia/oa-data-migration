package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0896;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0896Service extends IService<Formmain0896> {

    int updateBatch(List<Formmain0896> list);

    int updateBatchSelective(List<Formmain0896> list);

    int batchInsert(List<Formmain0896> list);

    int insertOrUpdate(Formmain0896 record);

    int insertOrUpdateSelective(Formmain0896 record);

}
