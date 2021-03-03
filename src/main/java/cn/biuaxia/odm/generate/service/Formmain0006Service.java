package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0006;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0006Service extends IService<Formmain0006> {

    int batchInsert(List<Formmain0006> list);

    int insertOrUpdate(Formmain0006 record);

    int insertOrUpdateSelective(Formmain0006 record);

}
