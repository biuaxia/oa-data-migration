package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0799Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0799;

import java.util.List;

import cn.biuaxia.odm.generate.service.Formmain0799Service;

@Service
public class Formmain0799ServiceImpl extends ServiceImpl<Formmain0799Mapper, Formmain0799> implements Formmain0799Service {

    @Override
    public int updateBatch(List<Formmain0799> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0799> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0799> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0799 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0799 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
