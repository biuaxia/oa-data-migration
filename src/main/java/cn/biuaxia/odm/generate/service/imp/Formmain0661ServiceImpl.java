package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0661;
import cn.biuaxia.odm.generate.mapper.Formmain0661Mapper;
import cn.biuaxia.odm.generate.service.Formmain0661Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0661ServiceImpl extends ServiceImpl<Formmain0661Mapper, Formmain0661> implements Formmain0661Service {

    @Override
    public int updateBatch(List<Formmain0661> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0661> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0661> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0661 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0661 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
