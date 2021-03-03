package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0763;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0763Service extends IService<Formmain0763> {

    int updateBatch(List<Formmain0763> list);

    int updateBatchSelective(List<Formmain0763> list);

    int batchInsert(List<Formmain0763> list);

    int insertOrUpdate(Formmain0763 record);

    int insertOrUpdateSelective(Formmain0763 record);

}
