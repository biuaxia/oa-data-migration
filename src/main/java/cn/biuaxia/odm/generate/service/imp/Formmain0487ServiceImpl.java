package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0487;
import cn.biuaxia.odm.generate.mapper.Formmain0487Mapper;
import cn.biuaxia.odm.generate.service.Formmain0487Service;

@Service
public class Formmain0487ServiceImpl extends ServiceImpl<Formmain0487Mapper, Formmain0487> implements Formmain0487Service {

    @Override
    public int updateBatch(List<Formmain0487> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0487> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0487> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0487 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0487 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
