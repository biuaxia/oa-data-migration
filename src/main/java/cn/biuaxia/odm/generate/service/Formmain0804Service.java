package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0804;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0804Service extends IService<Formmain0804> {

    int updateBatch(List<Formmain0804> list);

    int updateBatchSelective(List<Formmain0804> list);

    int batchInsert(List<Formmain0804> list);

    int insertOrUpdate(Formmain0804 record);

    int insertOrUpdateSelective(Formmain0804 record);

}
