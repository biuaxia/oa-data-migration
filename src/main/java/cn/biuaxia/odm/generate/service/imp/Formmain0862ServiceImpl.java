package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0862;
import cn.biuaxia.odm.generate.mapper.Formmain0862Mapper;
import cn.biuaxia.odm.generate.service.Formmain0862Service;

@Service
public class Formmain0862ServiceImpl extends ServiceImpl<Formmain0862Mapper, Formmain0862> implements Formmain0862Service {

    @Override
    public int updateBatch(List<Formmain0862> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0862> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0862> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0862 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0862 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
