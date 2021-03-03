package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0014;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0014Service extends IService<Formmain0014> {

    int batchInsert(List<Formmain0014> list);

    int insertOrUpdate(Formmain0014 record);

    int insertOrUpdateSelective(Formmain0014 record);

}
