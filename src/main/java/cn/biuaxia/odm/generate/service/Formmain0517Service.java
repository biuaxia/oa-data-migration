package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0517;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0517Service extends IService<Formmain0517> {

    int updateBatch(List<Formmain0517> list);

    int updateBatchSelective(List<Formmain0517> list);

    int batchInsert(List<Formmain0517> list);

    int insertOrUpdate(Formmain0517 record);

    int insertOrUpdateSelective(Formmain0517 record);

}
