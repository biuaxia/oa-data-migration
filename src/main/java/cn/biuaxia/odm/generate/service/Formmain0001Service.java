package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0001;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0001Service extends IService<Formmain0001> {

    int batchInsert(List<Formmain0001> list);

    int insertOrUpdate(Formmain0001 record);

    int insertOrUpdateSelective(Formmain0001 record);

}
