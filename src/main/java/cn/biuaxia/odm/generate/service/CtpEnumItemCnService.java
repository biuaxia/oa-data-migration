package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.CtpEnumItemCn;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CtpEnumItemCnService extends IService<CtpEnumItemCn> {

    int updateBatch(List<CtpEnumItemCn> list);

    int updateBatchSelective(List<CtpEnumItemCn> list);

    int batchInsert(List<CtpEnumItemCn> list);

    int insertOrUpdate(CtpEnumItemCn record);

    int insertOrUpdateSelective(CtpEnumItemCn record);

}
