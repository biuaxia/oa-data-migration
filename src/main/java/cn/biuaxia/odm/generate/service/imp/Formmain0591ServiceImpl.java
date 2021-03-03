package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0591Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0591;
import cn.biuaxia.odm.generate.service.Formmain0591Service;

@Service
public class Formmain0591ServiceImpl extends ServiceImpl<Formmain0591Mapper, Formmain0591> implements Formmain0591Service {

    @Override
    public int updateBatch(List<Formmain0591> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0591> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0591> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0591 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0591 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
