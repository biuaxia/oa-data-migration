package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0070;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0070Service extends IService<Formmain0070> {

    int batchInsert(List<Formmain0070> list);

    int insertOrUpdate(Formmain0070 record);

    int insertOrUpdateSelective(Formmain0070 record);

}
