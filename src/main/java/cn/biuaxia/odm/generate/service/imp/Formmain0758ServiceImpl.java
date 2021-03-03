package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0758;
import cn.biuaxia.odm.generate.mapper.Formmain0758Mapper;
import cn.biuaxia.odm.generate.service.Formmain0758Service;

@Service
public class Formmain0758ServiceImpl extends ServiceImpl<Formmain0758Mapper, Formmain0758> implements Formmain0758Service {

    @Override
    public int updateBatch(List<Formmain0758> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0758> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0758> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0758 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0758 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
