package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0097;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0097Service extends IService<Formmain0097> {

    int batchInsert(List<Formmain0097> list);

    int insertOrUpdate(Formmain0097 record);

    int insertOrUpdateSelective(Formmain0097 record);

}
