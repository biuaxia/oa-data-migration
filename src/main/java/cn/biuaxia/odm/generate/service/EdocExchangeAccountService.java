package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.EdocExchangeAccount;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface EdocExchangeAccountService extends IService<EdocExchangeAccount> {

    int updateBatch(List<EdocExchangeAccount> list);

    int updateBatchSelective(List<EdocExchangeAccount> list);

    int batchInsert(List<EdocExchangeAccount> list);

    int insertOrUpdate(EdocExchangeAccount record);

    int insertOrUpdateSelective(EdocExchangeAccount record);

}
