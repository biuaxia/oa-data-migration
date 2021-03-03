package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0910;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0910Service extends IService<Formmain0910> {

    int updateBatch(List<Formmain0910> list);

    int updateBatchSelective(List<Formmain0910> list);

    int batchInsert(List<Formmain0910> list);

    int insertOrUpdate(Formmain0910 record);

    int insertOrUpdateSelective(Formmain0910 record);

}
