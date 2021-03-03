package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0695;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0695Service extends IService<Formmain0695> {

    int updateBatch(List<Formmain0695> list);

    int updateBatchSelective(List<Formmain0695> list);

    int batchInsert(List<Formmain0695> list);

    int insertOrUpdate(Formmain0695 record);

    int insertOrUpdateSelective(Formmain0695 record);

}
