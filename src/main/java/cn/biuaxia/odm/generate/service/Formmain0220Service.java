package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0220;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0220Service extends IService<Formmain0220> {


    int updateBatch(List<Formmain0220> list);

    int updateBatchSelective(List<Formmain0220> list);

    int batchInsert(List<Formmain0220> list);

    int insertOrUpdate(Formmain0220 record);

    int insertOrUpdateSelective(Formmain0220 record);

}
