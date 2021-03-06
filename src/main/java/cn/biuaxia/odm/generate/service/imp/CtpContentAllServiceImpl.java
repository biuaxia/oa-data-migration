package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.CtpContentAll;
import cn.biuaxia.odm.generate.mapper.CtpContentAllMapper;
import cn.biuaxia.odm.generate.service.CtpContentAllService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtpContentAllServiceImpl extends ServiceImpl<CtpContentAllMapper, CtpContentAll> implements CtpContentAllService {

    @Override
    public int updateBatch(List<CtpContentAll> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpContentAll> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpContentAll> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpContentAll record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpContentAll record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
