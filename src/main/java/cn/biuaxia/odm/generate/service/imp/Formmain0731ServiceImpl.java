package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0731;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0731Mapper;
import cn.biuaxia.odm.generate.service.Formmain0731Service;

@Service
public class Formmain0731ServiceImpl extends ServiceImpl<Formmain0731Mapper, Formmain0731> implements Formmain0731Service {

    @Override
    public int updateBatch(List<Formmain0731> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0731> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0731> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0731 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0731 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
