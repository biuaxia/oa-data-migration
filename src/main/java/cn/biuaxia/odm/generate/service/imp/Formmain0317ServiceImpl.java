package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0317Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0317;
import cn.biuaxia.odm.generate.service.Formmain0317Service;

@Service
public class Formmain0317ServiceImpl extends ServiceImpl<Formmain0317Mapper, Formmain0317> implements Formmain0317Service {

    @Override
    public int updateBatch(List<Formmain0317> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0317> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0317> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0317 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0317 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
