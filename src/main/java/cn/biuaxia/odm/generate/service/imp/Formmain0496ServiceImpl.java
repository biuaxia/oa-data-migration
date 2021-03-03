package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0496;
import cn.biuaxia.odm.generate.mapper.Formmain0496Mapper;
import cn.biuaxia.odm.generate.service.Formmain0496Service;

@Service
public class Formmain0496ServiceImpl extends ServiceImpl<Formmain0496Mapper, Formmain0496> implements Formmain0496Service {

    @Override
    public int updateBatch(List<Formmain0496> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0496> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0496> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0496 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0496 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
