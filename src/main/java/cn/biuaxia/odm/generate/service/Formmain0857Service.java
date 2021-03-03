package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0857;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0857Service extends IService<Formmain0857> {

    int updateBatch(List<Formmain0857> list);

    int updateBatchSelective(List<Formmain0857> list);

    int batchInsert(List<Formmain0857> list);

    int insertOrUpdate(Formmain0857 record);

    int insertOrUpdateSelective(Formmain0857 record);

}
