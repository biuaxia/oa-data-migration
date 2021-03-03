package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0516Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0516;
import cn.biuaxia.odm.generate.service.Formmain0516Service;

@Service
public class Formmain0516ServiceImpl extends ServiceImpl<Formmain0516Mapper, Formmain0516> implements Formmain0516Service {

    @Override
    public int updateBatch(List<Formmain0516> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0516> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0516> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0516 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0516 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
