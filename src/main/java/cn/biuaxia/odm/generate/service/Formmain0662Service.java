package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0662;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0662Service extends IService<Formmain0662> {

    int updateBatch(List<Formmain0662> list);

    int updateBatchSelective(List<Formmain0662> list);

    int batchInsert(List<Formmain0662> list);

    int insertOrUpdate(Formmain0662 record);

    int insertOrUpdateSelective(Formmain0662 record);

}
