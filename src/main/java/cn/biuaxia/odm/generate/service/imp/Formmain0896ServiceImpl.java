package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0896;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0896Mapper;
import cn.biuaxia.odm.generate.service.Formmain0896Service;

@Service
public class Formmain0896ServiceImpl extends ServiceImpl<Formmain0896Mapper, Formmain0896> implements Formmain0896Service {

    @Override
    public int updateBatch(List<Formmain0896> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0896> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0896> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0896 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0896 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
