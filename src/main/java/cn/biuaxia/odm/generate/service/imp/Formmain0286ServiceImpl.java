package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0286Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0286;
import cn.biuaxia.odm.generate.service.Formmain0286Service;

@Service
public class Formmain0286ServiceImpl extends ServiceImpl<Formmain0286Mapper, Formmain0286> implements Formmain0286Service {

    @Override
    public int updateBatch(List<Formmain0286> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0286> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0286> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0286 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0286 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
