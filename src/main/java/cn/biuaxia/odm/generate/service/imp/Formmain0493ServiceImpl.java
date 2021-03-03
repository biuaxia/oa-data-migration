package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0493;
import cn.biuaxia.odm.generate.mapper.Formmain0493Mapper;
import cn.biuaxia.odm.generate.service.Formmain0493Service;

@Service
public class Formmain0493ServiceImpl extends ServiceImpl<Formmain0493Mapper, Formmain0493> implements Formmain0493Service {

    @Override
    public int updateBatch(List<Formmain0493> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0493> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0493> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0493 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0493 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
