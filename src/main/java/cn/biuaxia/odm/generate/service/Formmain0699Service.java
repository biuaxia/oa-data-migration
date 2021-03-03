package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0699;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0699Service extends IService<Formmain0699> {

    int updateBatch(List<Formmain0699> list);

    int updateBatchSelective(List<Formmain0699> list);

    int batchInsert(List<Formmain0699> list);

    int insertOrUpdate(Formmain0699 record);

    int insertOrUpdateSelective(Formmain0699 record);

}
