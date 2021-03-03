package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0872;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0872Service extends IService<Formmain0872> {

    int updateBatch(List<Formmain0872> list);

    int updateBatchSelective(List<Formmain0872> list);

    int batchInsert(List<Formmain0872> list);

    int insertOrUpdate(Formmain0872 record);

    int insertOrUpdateSelective(Formmain0872 record);

}
