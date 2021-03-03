package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0057;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0057Service extends IService<Formmain0057> {

    int batchInsert(List<Formmain0057> list);

    int insertOrUpdate(Formmain0057 record);

    int insertOrUpdateSelective(Formmain0057 record);

}
