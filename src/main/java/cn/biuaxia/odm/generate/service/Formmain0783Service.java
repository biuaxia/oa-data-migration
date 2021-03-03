package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0783;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0783Service extends IService<Formmain0783> {


    int updateBatch(List<Formmain0783> list);

    int updateBatchSelective(List<Formmain0783> list);

    int batchInsert(List<Formmain0783> list);

    int insertOrUpdate(Formmain0783 record);

    int insertOrUpdateSelective(Formmain0783 record);

}
