package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0506Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0506;
import cn.biuaxia.odm.generate.service.Formmain0506Service;

@Service
public class Formmain0506ServiceImpl extends ServiceImpl<Formmain0506Mapper, Formmain0506> implements Formmain0506Service {

    @Override
    public int updateBatch(List<Formmain0506> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0506> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0506> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0506 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0506 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
