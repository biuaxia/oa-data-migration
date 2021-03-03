package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0804;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0804Service extends IService<Formmain0804> {


    int updateBatch(List<Formmain0804> list);

    int updateBatchSelective(List<Formmain0804> list);

    int batchInsert(List<Formmain0804> list);

    int insertOrUpdate(Formmain0804 record);

    int insertOrUpdateSelective(Formmain0804 record);

}
