package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0267Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0267;
import cn.biuaxia.odm.generate.service.Formmain0267Service;

@Service
public class Formmain0267ServiceImpl extends ServiceImpl<Formmain0267Mapper, Formmain0267> implements Formmain0267Service {

    @Override
    public int updateBatch(List<Formmain0267> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0267> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0267> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0267 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0267 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
