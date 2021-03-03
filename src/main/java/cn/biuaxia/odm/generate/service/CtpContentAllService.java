package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.CtpContentAll;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CtpContentAllService extends IService<CtpContentAll> {


    int updateBatch(List<CtpContentAll> list);

    int updateBatchSelective(List<CtpContentAll> list);

    int batchInsert(List<CtpContentAll> list);

    int insertOrUpdate(CtpContentAll record);

    int insertOrUpdateSelective(CtpContentAll record);

}
