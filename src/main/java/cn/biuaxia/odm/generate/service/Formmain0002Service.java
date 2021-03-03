package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0002;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0002Service extends IService<Formmain0002> {

    int batchInsert(List<Formmain0002> list);

    int insertOrUpdate(Formmain0002 record);

    int insertOrUpdateSelective(Formmain0002 record);

}
