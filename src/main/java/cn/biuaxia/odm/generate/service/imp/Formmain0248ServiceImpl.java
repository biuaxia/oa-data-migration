package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0248;
import cn.biuaxia.odm.generate.mapper.Formmain0248Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.service.Formmain0248Service;

@Service
public class Formmain0248ServiceImpl extends ServiceImpl<Formmain0248Mapper, Formmain0248> implements Formmain0248Service {

    @Override
    public int updateBatch(List<Formmain0248> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0248> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0248> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0248 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0248 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
