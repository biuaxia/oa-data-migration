package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0207;
import cn.biuaxia.odm.generate.mapper.Formmain0207Mapper;
import cn.biuaxia.odm.generate.service.Formmain0207Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0207ServiceImpl extends ServiceImpl<Formmain0207Mapper, Formmain0207> implements Formmain0207Service {

    @Override
    public int updateBatch(List<Formmain0207> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0207> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0207> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0207 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0207 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
