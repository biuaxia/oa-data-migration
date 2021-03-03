package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0862;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0862Service extends IService<Formmain0862> {

    int updateBatch(List<Formmain0862> list);

    int updateBatchSelective(List<Formmain0862> list);

    int batchInsert(List<Formmain0862> list);

    int insertOrUpdate(Formmain0862 record);

    int insertOrUpdateSelective(Formmain0862 record);

}
