package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0037;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0037Service extends IService<Formmain0037> {

    int batchInsert(List<Formmain0037> list);

    int insertOrUpdate(Formmain0037 record);

    int insertOrUpdateSelective(Formmain0037 record);

}
