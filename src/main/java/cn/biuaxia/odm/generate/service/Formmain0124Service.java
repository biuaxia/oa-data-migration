package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0124;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0124Service extends IService<Formmain0124> {

    int batchInsert(List<Formmain0124> list);

    int insertOrUpdate(Formmain0124 record);

    int insertOrUpdateSelective(Formmain0124 record);

}
