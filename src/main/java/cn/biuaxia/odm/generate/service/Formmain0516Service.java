package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0516;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0516Service extends IService<Formmain0516> {

    int updateBatch(List<Formmain0516> list);

    int updateBatchSelective(List<Formmain0516> list);

    int batchInsert(List<Formmain0516> list);

    int insertOrUpdate(Formmain0516 record);

    int insertOrUpdateSelective(Formmain0516 record);

}
