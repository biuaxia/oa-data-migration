package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0064;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0064Service extends IService<Formmain0064> {

    int batchInsert(List<Formmain0064> list);

    int insertOrUpdate(Formmain0064 record);

    int insertOrUpdateSelective(Formmain0064 record);

}
