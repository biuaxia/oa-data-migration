package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0471;
import cn.biuaxia.odm.generate.mapper.Formmain0471Mapper;
import cn.biuaxia.odm.generate.service.Formmain0471Service;

@Service
public class Formmain0471ServiceImpl extends ServiceImpl<Formmain0471Mapper, Formmain0471> implements Formmain0471Service {

    @Override
    public int updateBatch(List<Formmain0471> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0471> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0471> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0471 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0471 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
