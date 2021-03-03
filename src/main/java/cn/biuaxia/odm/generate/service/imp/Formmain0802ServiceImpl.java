package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0802Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0802;
import cn.biuaxia.odm.generate.service.Formmain0802Service;

@Service
public class Formmain0802ServiceImpl extends ServiceImpl<Formmain0802Mapper, Formmain0802> implements Formmain0802Service {

    @Override
    public int updateBatch(List<Formmain0802> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0802> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0802> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0802 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0802 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
