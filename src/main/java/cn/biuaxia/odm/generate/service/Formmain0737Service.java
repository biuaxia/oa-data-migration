package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0737;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

public interface Formmain0737Service extends IService<Formmain0737> {

    int updateBatch(List<Formmain0737> list);

    int updateBatchSelective(List<Formmain0737> list);

    int batchInsert(List<Formmain0737> list);

    int insertOrUpdate(Formmain0737 record);

    int insertOrUpdateSelective(Formmain0737 record);

}
