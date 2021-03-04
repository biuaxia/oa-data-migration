package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.EdocExchangeAccount;
import cn.biuaxia.odm.generate.mapper.EdocExchangeAccountMapper;
import cn.biuaxia.odm.generate.service.EdocExchangeAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EdocExchangeAccountServiceImpl extends ServiceImpl<EdocExchangeAccountMapper, EdocExchangeAccount> implements EdocExchangeAccountService {

    @Override
    public int updateBatch(List<EdocExchangeAccount> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<EdocExchangeAccount> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<EdocExchangeAccount> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(EdocExchangeAccount record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(EdocExchangeAccount record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
