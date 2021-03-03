package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0308Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0308;
import cn.biuaxia.odm.generate.service.Formmain0308Service;

@Service
public class Formmain0308ServiceImpl extends ServiceImpl<Formmain0308Mapper, Formmain0308> implements Formmain0308Service {

    @Override
    public int updateBatch(List<Formmain0308> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0308> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0308> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0308 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0308 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
