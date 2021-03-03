package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0003;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0003Service extends IService<Formmain0003> {

    int batchInsert(List<Formmain0003> list);

    int insertOrUpdate(Formmain0003 record);

    int insertOrUpdateSelective(Formmain0003 record);

}
