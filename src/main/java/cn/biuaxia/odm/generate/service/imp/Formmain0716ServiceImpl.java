package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0716;
import cn.biuaxia.odm.generate.mapper.Formmain0716Mapper;
import cn.biuaxia.odm.generate.service.Formmain0716Service;

@Service
public class Formmain0716ServiceImpl extends ServiceImpl<Formmain0716Mapper, Formmain0716> implements Formmain0716Service {

    @Override
    public int updateBatch(List<Formmain0716> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0716> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0716> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0716 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0716 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
