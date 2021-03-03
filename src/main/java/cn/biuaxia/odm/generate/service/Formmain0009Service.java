package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0009;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0009Service extends IService<Formmain0009> {

    int batchInsert(List<Formmain0009> list);

    int insertOrUpdate(Formmain0009 record);

    int insertOrUpdateSelective(Formmain0009 record);

}
