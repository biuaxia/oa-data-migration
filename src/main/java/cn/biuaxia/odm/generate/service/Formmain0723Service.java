package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0723;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0723Service extends IService<Formmain0723> {

    int updateBatch(List<Formmain0723> list);

    int updateBatchSelective(List<Formmain0723> list);

    int batchInsert(List<Formmain0723> list);

    int insertOrUpdate(Formmain0723 record);

    int insertOrUpdateSelective(Formmain0723 record);

}
