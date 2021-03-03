package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0215;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0215Mapper;
import cn.biuaxia.odm.generate.service.Formmain0215Service;

@Service
public class Formmain0215ServiceImpl extends ServiceImpl<Formmain0215Mapper, Formmain0215> implements Formmain0215Service {

    @Override
    public int updateBatch(List<Formmain0215> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0215> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0215> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0215 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0215 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
