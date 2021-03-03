package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0721;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0721Service extends IService<Formmain0721> {

    int updateBatch(List<Formmain0721> list);

    int updateBatchSelective(List<Formmain0721> list);

    int batchInsert(List<Formmain0721> list);

    int insertOrUpdate(Formmain0721 record);

    int insertOrUpdateSelective(Formmain0721 record);

}
