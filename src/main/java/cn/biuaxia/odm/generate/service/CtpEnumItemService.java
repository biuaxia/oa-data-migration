package cn.biuaxia.odm.generate.service;

import java.util.List;

import cn.biuaxia.odm.generate.domain.CtpEnumItem;
import com.baomidou.mybatisplus.extension.service.IService;

public interface CtpEnumItemService extends IService<CtpEnumItem> {


    int updateBatch(List<CtpEnumItem> list);

    int updateBatchSelective(List<CtpEnumItem> list);

    int batchInsert(List<CtpEnumItem> list);

    int insertOrUpdate(CtpEnumItem record);

    int insertOrUpdateSelective(CtpEnumItem record);

}
