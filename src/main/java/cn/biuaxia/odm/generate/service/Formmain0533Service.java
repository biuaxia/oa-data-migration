package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0533;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0533Service extends IService<Formmain0533> {

    int updateBatch(List<Formmain0533> list);

    int updateBatchSelective(List<Formmain0533> list);

    int batchInsert(List<Formmain0533> list);

    int insertOrUpdate(Formmain0533 record);

    int insertOrUpdateSelective(Formmain0533 record);

}
