package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0822Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0822;
import cn.biuaxia.odm.generate.service.Formmain0822Service;

@Service
public class Formmain0822ServiceImpl extends ServiceImpl<Formmain0822Mapper, Formmain0822> implements Formmain0822Service {

    @Override
    public int updateBatch(List<Formmain0822> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0822> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0822> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0822 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0822 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
