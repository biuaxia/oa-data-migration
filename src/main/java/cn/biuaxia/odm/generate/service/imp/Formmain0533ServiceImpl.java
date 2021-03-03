package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0533;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0533Mapper;
import cn.biuaxia.odm.generate.service.Formmain0533Service;

@Service
public class Formmain0533ServiceImpl extends ServiceImpl<Formmain0533Mapper, Formmain0533> implements Formmain0533Service {

    @Override
    public int updateBatch(List<Formmain0533> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0533> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0533> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0533 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0533 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
