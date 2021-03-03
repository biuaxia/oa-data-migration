package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0803Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0803;
import cn.biuaxia.odm.generate.service.Formmain0803Service;

@Service
public class Formmain0803ServiceImpl extends ServiceImpl<Formmain0803Mapper, Formmain0803> implements Formmain0803Service {

    @Override
    public int updateBatch(List<Formmain0803> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0803> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0803> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0803 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0803 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
