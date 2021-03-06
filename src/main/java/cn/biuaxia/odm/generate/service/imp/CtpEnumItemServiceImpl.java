package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.CtpEnumItem;
import cn.biuaxia.odm.generate.mapper.CtpEnumItemMapper;
import cn.biuaxia.odm.generate.service.CtpEnumItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtpEnumItemServiceImpl extends ServiceImpl<CtpEnumItemMapper, CtpEnumItem> implements CtpEnumItemService {

    @Override
    public int updateBatch(List<CtpEnumItem> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpEnumItem> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpEnumItem> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpEnumItem record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpEnumItem record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
