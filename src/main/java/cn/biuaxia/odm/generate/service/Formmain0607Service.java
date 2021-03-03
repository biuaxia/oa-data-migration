package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0607;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0607Service extends IService<Formmain0607> {

    int updateBatch(List<Formmain0607> list);

    int updateBatchSelective(List<Formmain0607> list);

    int batchInsert(List<Formmain0607> list);

    int insertOrUpdate(Formmain0607 record);

    int insertOrUpdateSelective(Formmain0607 record);

}
