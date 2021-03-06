package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.CtpEnumItemCn;
import cn.biuaxia.odm.generate.mapper.CtpEnumItemCnMapper;
import cn.biuaxia.odm.generate.service.CtpEnumItemCnService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtpEnumItemCnServiceImpl extends ServiceImpl<CtpEnumItemCnMapper, CtpEnumItemCn> implements CtpEnumItemCnService {

    @Override
    public int updateBatch(List<CtpEnumItemCn> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpEnumItemCn> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpEnumItemCn> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpEnumItemCn record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpEnumItemCn record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
