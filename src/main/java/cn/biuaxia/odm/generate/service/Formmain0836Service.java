package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0836;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0836Service extends IService<Formmain0836> {

    int updateBatch(List<Formmain0836> list);

    int updateBatchSelective(List<Formmain0836> list);

    int batchInsert(List<Formmain0836> list);

    int insertOrUpdate(Formmain0836 record);

    int insertOrUpdateSelective(Formmain0836 record);

}
