package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0739;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0739Service extends IService<Formmain0739> {

    int updateBatch(List<Formmain0739> list);

    int updateBatchSelective(List<Formmain0739> list);

    int batchInsert(List<Formmain0739> list);

    int insertOrUpdate(Formmain0739 record);

    int insertOrUpdateSelective(Formmain0739 record);

}
