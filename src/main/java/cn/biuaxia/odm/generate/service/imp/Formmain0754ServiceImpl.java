package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0754;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0754Mapper;
import cn.biuaxia.odm.generate.service.Formmain0754Service;

@Service
public class Formmain0754ServiceImpl extends ServiceImpl<Formmain0754Mapper, Formmain0754> implements Formmain0754Service {

    @Override
    public int updateBatch(List<Formmain0754> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0754> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0754> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0754 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0754 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
