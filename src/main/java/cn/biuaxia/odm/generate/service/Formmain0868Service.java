package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0868;
import com.baomidou.mybatisplus.extension.service.IService;

public interface Formmain0868Service extends IService<Formmain0868> {


    int updateBatch(List<Formmain0868> list);

    int updateBatchSelective(List<Formmain0868> list);

    int batchInsert(List<Formmain0868> list);

    int insertOrUpdate(Formmain0868 record);

    int insertOrUpdateSelective(Formmain0868 record);

}
