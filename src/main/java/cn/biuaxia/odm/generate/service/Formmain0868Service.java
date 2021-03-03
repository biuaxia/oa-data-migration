package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0868;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Formmain0868Service extends IService<Formmain0868> {

    int updateBatch(List<Formmain0868> list);

    int updateBatchSelective(List<Formmain0868> list);

    int batchInsert(List<Formmain0868> list);

    int insertOrUpdate(Formmain0868 record);

    int insertOrUpdateSelective(Formmain0868 record);

}
