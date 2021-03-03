package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0026;
import cn.biuaxia.odm.generate.mapper.Formmain0026Mapper;
import cn.biuaxia.odm.generate.service.Formmain0026Service;

@Service
public class Formmain0026ServiceImpl extends ServiceImpl<Formmain0026Mapper, Formmain0026> implements Formmain0026Service {

    @Override
    public int updateBatch(List<Formmain0026> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0026> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0026> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0026 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0026 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
