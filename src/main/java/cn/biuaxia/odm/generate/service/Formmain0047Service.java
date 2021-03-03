package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0047;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0047Service extends IService<Formmain0047> {

    int batchInsert(List<Formmain0047> list);

    int insertOrUpdate(Formmain0047 record);

    int insertOrUpdateSelective(Formmain0047 record);

}
