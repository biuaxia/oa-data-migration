package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0010;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0010Service extends IService<Formmain0010> {

    int batchInsert(List<Formmain0010> list);

    int insertOrUpdate(Formmain0010 record);

    int insertOrUpdateSelective(Formmain0010 record);

}
