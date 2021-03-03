package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0770Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0770;
import cn.biuaxia.odm.generate.service.Formmain0770Service;

@Service
public class Formmain0770ServiceImpl extends ServiceImpl<Formmain0770Mapper, Formmain0770> implements Formmain0770Service {

    @Override
    public int updateBatch(List<Formmain0770> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0770> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0770> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0770 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0770 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
