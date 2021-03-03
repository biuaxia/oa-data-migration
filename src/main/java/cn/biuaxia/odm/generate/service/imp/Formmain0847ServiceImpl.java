package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0847Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0847;
import cn.biuaxia.odm.generate.service.Formmain0847Service;

@Service
public class Formmain0847ServiceImpl extends ServiceImpl<Formmain0847Mapper, Formmain0847> implements Formmain0847Service {

    @Override
    public int updateBatch(List<Formmain0847> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0847> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0847> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0847 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0847 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
