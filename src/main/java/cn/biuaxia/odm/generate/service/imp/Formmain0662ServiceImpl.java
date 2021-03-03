package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0662Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0662;
import cn.biuaxia.odm.generate.service.Formmain0662Service;

@Service
public class Formmain0662ServiceImpl extends ServiceImpl<Formmain0662Mapper, Formmain0662> implements Formmain0662Service {

    @Override
    public int updateBatch(List<Formmain0662> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0662> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0662> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0662 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0662 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
