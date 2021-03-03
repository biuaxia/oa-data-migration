package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0697;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0697Service extends IService<Formmain0697> {

    int updateBatch(List<Formmain0697> list);

    int updateBatchSelective(List<Formmain0697> list);

    int batchInsert(List<Formmain0697> list);

    int insertOrUpdate(Formmain0697 record);

    int insertOrUpdateSelective(Formmain0697 record);

}
