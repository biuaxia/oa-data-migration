package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0045;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0045Service extends IService<Formmain0045> {

    int batchInsert(List<Formmain0045> list);

    int insertOrUpdate(Formmain0045 record);

    int insertOrUpdateSelective(Formmain0045 record);

}
