package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0912;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0912Service extends IService<Formmain0912> {

    int updateBatch(List<Formmain0912> list);

    int updateBatchSelective(List<Formmain0912> list);

    int batchInsert(List<Formmain0912> list);

    int insertOrUpdate(Formmain0912 record);

    int insertOrUpdateSelective(Formmain0912 record);

}
