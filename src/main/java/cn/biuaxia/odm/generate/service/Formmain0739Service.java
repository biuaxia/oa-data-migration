package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0739;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0739Service extends IService<Formmain0739> {


    int updateBatch(List<Formmain0739> list);

    int updateBatchSelective(List<Formmain0739> list);

    int batchInsert(List<Formmain0739> list);

    int insertOrUpdate(Formmain0739 record);

    int insertOrUpdateSelective(Formmain0739 record);

}
