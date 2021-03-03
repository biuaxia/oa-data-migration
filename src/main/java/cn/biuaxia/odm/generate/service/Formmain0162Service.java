package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0162;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0162Service extends IService<Formmain0162> {

    int updateBatch(List<Formmain0162> list);

    int updateBatchSelective(List<Formmain0162> list);

    int batchInsert(List<Formmain0162> list);

    int insertOrUpdate(Formmain0162 record);

    int insertOrUpdateSelective(Formmain0162 record);

}
