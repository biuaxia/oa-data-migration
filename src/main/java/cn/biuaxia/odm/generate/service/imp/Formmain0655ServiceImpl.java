package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0655;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0655Mapper;
import cn.biuaxia.odm.generate.service.Formmain0655Service;

@Service
public class Formmain0655ServiceImpl extends ServiceImpl<Formmain0655Mapper, Formmain0655> implements Formmain0655Service {

    @Override
    public int updateBatch(List<Formmain0655> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0655> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0655> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0655 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0655 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
