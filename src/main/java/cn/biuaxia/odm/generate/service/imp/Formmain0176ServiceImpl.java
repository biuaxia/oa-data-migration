package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0176;
import cn.biuaxia.odm.generate.mapper.Formmain0176Mapper;
import cn.biuaxia.odm.generate.service.Formmain0176Service;

@Service
public class Formmain0176ServiceImpl extends ServiceImpl<Formmain0176Mapper, Formmain0176> implements Formmain0176Service {

    @Override
    public int updateBatch(List<Formmain0176> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0176> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0176> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0176 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0176 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
