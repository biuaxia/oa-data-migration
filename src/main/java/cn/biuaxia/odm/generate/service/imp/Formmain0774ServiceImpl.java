package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0774Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0774;
import cn.biuaxia.odm.generate.service.Formmain0774Service;

@Service
public class Formmain0774ServiceImpl extends ServiceImpl<Formmain0774Mapper, Formmain0774> implements Formmain0774Service {

    @Override
    public int updateBatch(List<Formmain0774> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0774> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0774> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0774 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0774 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
