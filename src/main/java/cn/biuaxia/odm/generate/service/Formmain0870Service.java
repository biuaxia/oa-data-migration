package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0870;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0870Service extends IService<Formmain0870> {

    int updateBatch(List<Formmain0870> list);

    int updateBatchSelective(List<Formmain0870> list);

    int batchInsert(List<Formmain0870> list);

    int insertOrUpdate(Formmain0870 record);

    int insertOrUpdateSelective(Formmain0870 record);

}
