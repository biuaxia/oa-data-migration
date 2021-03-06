package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0209;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0209Service extends IService<Formmain0209> {

    int updateBatch(List<Formmain0209> list);

    int updateBatchSelective(List<Formmain0209> list);

    int batchInsert(List<Formmain0209> list);

    int insertOrUpdate(Formmain0209 record);

    int insertOrUpdateSelective(Formmain0209 record);

}
