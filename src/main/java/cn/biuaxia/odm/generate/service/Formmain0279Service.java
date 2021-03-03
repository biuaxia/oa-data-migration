package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0279;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0279Service extends IService<Formmain0279> {

    int updateBatch(List<Formmain0279> list);

    int updateBatchSelective(List<Formmain0279> list);

    int batchInsert(List<Formmain0279> list);

    int insertOrUpdate(Formmain0279 record);

    int insertOrUpdateSelective(Formmain0279 record);

}
