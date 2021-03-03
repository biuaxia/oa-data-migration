package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0607;
import cn.biuaxia.odm.generate.mapper.Formmain0607Mapper;
import cn.biuaxia.odm.generate.service.Formmain0607Service;

@Service
public class Formmain0607ServiceImpl extends ServiceImpl<Formmain0607Mapper, Formmain0607> implements Formmain0607Service {

    @Override
    public int updateBatch(List<Formmain0607> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0607> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0607> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0607 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0607 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
