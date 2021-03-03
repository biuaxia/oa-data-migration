package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0148;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0148Service extends IService<Formmain0148> {

    int batchInsert(List<Formmain0148> list);

    int insertOrUpdate(Formmain0148 record);

    int insertOrUpdateSelective(Formmain0148 record);

}
