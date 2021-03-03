package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0028;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0028Service extends IService<Formmain0028> {

    int batchInsert(List<Formmain0028> list);

    int insertOrUpdate(Formmain0028 record);

    int insertOrUpdateSelective(Formmain0028 record);

}
