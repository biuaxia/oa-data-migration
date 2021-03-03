package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0725Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0725;
import cn.biuaxia.odm.generate.service.Formmain0725Service;

@Service
public class Formmain0725ServiceImpl extends ServiceImpl<Formmain0725Mapper, Formmain0725> implements Formmain0725Service {

    @Override
    public int updateBatch(List<Formmain0725> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0725> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0725> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0725 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0725 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
