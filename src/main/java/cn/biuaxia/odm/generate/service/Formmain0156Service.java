package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0156;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0156Service extends IService<Formmain0156> {

    int updateBatch(List<Formmain0156> list);

    int updateBatchSelective(List<Formmain0156> list);

    int batchInsert(List<Formmain0156> list);

    int insertOrUpdate(Formmain0156 record);

    int insertOrUpdateSelective(Formmain0156 record);

}
