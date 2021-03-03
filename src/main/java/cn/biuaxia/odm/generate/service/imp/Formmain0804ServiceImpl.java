package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0804Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0804;
import cn.biuaxia.odm.generate.service.Formmain0804Service;

@Service
public class Formmain0804ServiceImpl extends ServiceImpl<Formmain0804Mapper, Formmain0804> implements Formmain0804Service {

    @Override
    public int updateBatch(List<Formmain0804> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0804> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0804> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0804 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0804 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
