package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0314;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0314Mapper;
import cn.biuaxia.odm.generate.service.Formmain0314Service;

@Service
public class Formmain0314ServiceImpl extends ServiceImpl<Formmain0314Mapper, Formmain0314> implements Formmain0314Service {

    @Override
    public int updateBatch(List<Formmain0314> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0314> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0314> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0314 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0314 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
