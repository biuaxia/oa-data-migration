package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0870;
import cn.biuaxia.odm.generate.mapper.Formmain0870Mapper;
import cn.biuaxia.odm.generate.service.Formmain0870Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0870ServiceImpl extends ServiceImpl<Formmain0870Mapper, Formmain0870> implements Formmain0870Service {

    @Override
    public int updateBatch(List<Formmain0870> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0870> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0870> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0870 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0870 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
