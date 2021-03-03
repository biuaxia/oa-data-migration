package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0783;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0783Service extends IService<Formmain0783> {

    int updateBatch(List<Formmain0783> list);

    int updateBatchSelective(List<Formmain0783> list);

    int batchInsert(List<Formmain0783> list);

    int insertOrUpdate(Formmain0783 record);

    int insertOrUpdateSelective(Formmain0783 record);

}
