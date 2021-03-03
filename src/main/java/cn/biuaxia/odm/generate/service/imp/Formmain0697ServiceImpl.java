package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0697Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0697;
import cn.biuaxia.odm.generate.service.Formmain0697Service;

@Service
public class Formmain0697ServiceImpl extends ServiceImpl<Formmain0697Mapper, Formmain0697> implements Formmain0697Service {

    @Override
    public int updateBatch(List<Formmain0697> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0697> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0697> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0697 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0697 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
