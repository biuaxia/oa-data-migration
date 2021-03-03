package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0015;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0015Service extends IService<Formmain0015> {

    int batchInsert(List<Formmain0015> list);

    int insertOrUpdate(Formmain0015 record);

    int insertOrUpdateSelective(Formmain0015 record);

}
