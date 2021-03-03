package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0285;
import cn.biuaxia.odm.generate.mapper.Formmain0285Mapper;
import cn.biuaxia.odm.generate.service.Formmain0285Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0285ServiceImpl extends ServiceImpl<Formmain0285Mapper, Formmain0285> implements Formmain0285Service {

    @Override
    public int updateBatch(List<Formmain0285> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0285> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0285> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0285 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0285 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
