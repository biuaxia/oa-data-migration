package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0531;
import cn.biuaxia.odm.generate.mapper.Formmain0531Mapper;
import cn.biuaxia.odm.generate.service.Formmain0531Service;

@Service
public class Formmain0531ServiceImpl extends ServiceImpl<Formmain0531Mapper, Formmain0531> implements Formmain0531Service {

    @Override
    public int updateBatch(List<Formmain0531> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0531> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0531> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0531 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0531 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
