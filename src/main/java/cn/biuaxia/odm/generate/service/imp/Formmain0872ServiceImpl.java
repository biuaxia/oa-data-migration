package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0872;
import cn.biuaxia.odm.generate.mapper.Formmain0872Mapper;
import cn.biuaxia.odm.generate.service.Formmain0872Service;

@Service
public class Formmain0872ServiceImpl extends ServiceImpl<Formmain0872Mapper, Formmain0872> implements Formmain0872Service {

    @Override
    public int updateBatch(List<Formmain0872> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0872> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0872> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0872 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0872 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
