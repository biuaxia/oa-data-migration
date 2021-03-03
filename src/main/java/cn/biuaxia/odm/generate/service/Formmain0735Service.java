package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0735;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0735Service extends IService<Formmain0735> {

    int updateBatch(List<Formmain0735> list);

    int updateBatchSelective(List<Formmain0735> list);

    int batchInsert(List<Formmain0735> list);

    int insertOrUpdate(Formmain0735 record);

    int insertOrUpdateSelective(Formmain0735 record);

}
