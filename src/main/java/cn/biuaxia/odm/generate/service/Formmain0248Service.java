package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0248;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0248Service extends IService<Formmain0248> {

    int updateBatch(List<Formmain0248> list);

    int updateBatchSelective(List<Formmain0248> list);

    int batchInsert(List<Formmain0248> list);

    int insertOrUpdate(Formmain0248 record);

    int insertOrUpdateSelective(Formmain0248 record);

}
