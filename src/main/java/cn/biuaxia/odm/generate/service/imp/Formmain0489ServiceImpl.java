package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0489;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0489Mapper;
import cn.biuaxia.odm.generate.service.Formmain0489Service;

@Service
public class Formmain0489ServiceImpl extends ServiceImpl<Formmain0489Mapper, Formmain0489> implements Formmain0489Service {

    @Override
    public int updateBatch(List<Formmain0489> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0489> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0489> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0489 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0489 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
