package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0696;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0696Service extends IService<Formmain0696> {

    int updateBatch(List<Formmain0696> list);

    int updateBatchSelective(List<Formmain0696> list);

    int batchInsert(List<Formmain0696> list);

    int insertOrUpdate(Formmain0696 record);

    int insertOrUpdateSelective(Formmain0696 record);

}
