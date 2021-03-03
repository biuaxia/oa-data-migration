package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0530Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0530;
import cn.biuaxia.odm.generate.service.Formmain0530Service;

@Service
public class Formmain0530ServiceImpl extends ServiceImpl<Formmain0530Mapper, Formmain0530> implements Formmain0530Service {

    @Override
    public int updateBatch(List<Formmain0530> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0530> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0530> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0530 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0530 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
