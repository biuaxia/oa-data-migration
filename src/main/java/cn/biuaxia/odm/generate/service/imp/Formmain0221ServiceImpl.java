package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0221;
import cn.biuaxia.odm.generate.mapper.Formmain0221Mapper;
import cn.biuaxia.odm.generate.service.Formmain0221Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0221ServiceImpl extends ServiceImpl<Formmain0221Mapper, Formmain0221> implements Formmain0221Service {

    @Override
    public int updateBatch(List<Formmain0221> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0221> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0221> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0221 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0221 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
