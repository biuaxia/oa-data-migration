package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0591;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0591Service extends IService<Formmain0591> {

    int updateBatch(List<Formmain0591> list);

    int updateBatchSelective(List<Formmain0591> list);

    int batchInsert(List<Formmain0591> list);

    int insertOrUpdate(Formmain0591 record);

    int insertOrUpdateSelective(Formmain0591 record);

}
