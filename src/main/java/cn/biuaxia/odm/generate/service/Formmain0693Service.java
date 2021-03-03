package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0693;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0693Service extends IService<Formmain0693> {

    int updateBatch(List<Formmain0693> list);

    int updateBatchSelective(List<Formmain0693> list);

    int batchInsert(List<Formmain0693> list);

    int insertOrUpdate(Formmain0693 record);

    int insertOrUpdateSelective(Formmain0693 record);

}
