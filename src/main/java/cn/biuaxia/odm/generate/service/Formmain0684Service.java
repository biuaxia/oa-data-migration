package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0684;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0684Service extends IService<Formmain0684> {

    int updateBatch(List<Formmain0684> list);

    int updateBatchSelective(List<Formmain0684> list);

    int batchInsert(List<Formmain0684> list);

    int insertOrUpdate(Formmain0684 record);

    int insertOrUpdateSelective(Formmain0684 record);

}
