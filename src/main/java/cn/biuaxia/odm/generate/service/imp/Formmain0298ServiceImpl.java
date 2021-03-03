package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0298;
import cn.biuaxia.odm.generate.mapper.Formmain0298Mapper;
import cn.biuaxia.odm.generate.service.Formmain0298Service;

@Service
public class Formmain0298ServiceImpl extends ServiceImpl<Formmain0298Mapper, Formmain0298> implements Formmain0298Service {

    @Override
    public int updateBatch(List<Formmain0298> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0298> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0298> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0298 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0298 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
