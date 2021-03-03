package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0279;
import cn.biuaxia.odm.generate.mapper.Formmain0279Mapper;
import cn.biuaxia.odm.generate.service.Formmain0279Service;

@Service
public class Formmain0279ServiceImpl extends ServiceImpl<Formmain0279Mapper, Formmain0279> implements Formmain0279Service {

    @Override
    public int updateBatch(List<Formmain0279> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0279> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0279> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0279 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0279 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
