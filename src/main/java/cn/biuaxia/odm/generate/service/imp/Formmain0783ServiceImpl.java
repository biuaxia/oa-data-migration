package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0783Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0783;
import cn.biuaxia.odm.generate.service.Formmain0783Service;

@Service
public class Formmain0783ServiceImpl extends ServiceImpl<Formmain0783Mapper, Formmain0783> implements Formmain0783Service {

    @Override
    public int updateBatch(List<Formmain0783> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0783> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0783> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0783 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0783 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
