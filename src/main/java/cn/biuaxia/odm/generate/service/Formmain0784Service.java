package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0784;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0784Service extends IService<Formmain0784> {

    int updateBatch(List<Formmain0784> list);

    int updateBatchSelective(List<Formmain0784> list);

    int batchInsert(List<Formmain0784> list);

    int insertOrUpdate(Formmain0784 record);

    int insertOrUpdateSelective(Formmain0784 record);

}
