package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0038;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0038Mapper;
import cn.biuaxia.odm.generate.service.Formmain0038Service;

@Service
public class Formmain0038ServiceImpl extends ServiceImpl<Formmain0038Mapper, Formmain0038> implements Formmain0038Service {

    @Override
    public int updateBatch(List<Formmain0038> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0038> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0038> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0038 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0038 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
