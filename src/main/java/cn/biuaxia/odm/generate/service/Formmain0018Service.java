package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0018;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0018Service extends IService<Formmain0018> {

    int batchInsert(List<Formmain0018> list);

    int insertOrUpdate(Formmain0018 record);

    int insertOrUpdateSelective(Formmain0018 record);

}
