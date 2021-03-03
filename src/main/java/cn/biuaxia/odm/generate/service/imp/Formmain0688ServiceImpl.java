package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0688;
import cn.biuaxia.odm.generate.mapper.Formmain0688Mapper;
import cn.biuaxia.odm.generate.service.Formmain0688Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0688ServiceImpl extends ServiceImpl<Formmain0688Mapper, Formmain0688> implements Formmain0688Service {

    @Override
    public int updateBatch(List<Formmain0688> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0688> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0688> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0688 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0688 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
