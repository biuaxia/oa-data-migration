package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0781;
import cn.biuaxia.odm.generate.mapper.Formmain0781Mapper;
import cn.biuaxia.odm.generate.service.Formmain0781Service;

@Service
public class Formmain0781ServiceImpl extends ServiceImpl<Formmain0781Mapper, Formmain0781> implements Formmain0781Service {

    @Override
    public int updateBatch(List<Formmain0781> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0781> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0781> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0781 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0781 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
