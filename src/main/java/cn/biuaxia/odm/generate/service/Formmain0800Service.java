package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0800;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0800Service extends IService<Formmain0800> {

    int updateBatch(List<Formmain0800> list);

    int updateBatchSelective(List<Formmain0800> list);

    int batchInsert(List<Formmain0800> list);

    int insertOrUpdate(Formmain0800 record);

    int insertOrUpdateSelective(Formmain0800 record);

}
