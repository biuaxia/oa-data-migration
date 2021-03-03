package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.Formmain0772;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface Formmain0772Service extends IService<Formmain0772> {

    int updateBatch(List<Formmain0772> list);

    int updateBatchSelective(List<Formmain0772> list);

    int batchInsert(List<Formmain0772> list);

    int insertOrUpdate(Formmain0772 record);

    int insertOrUpdateSelective(Formmain0772 record);

}
