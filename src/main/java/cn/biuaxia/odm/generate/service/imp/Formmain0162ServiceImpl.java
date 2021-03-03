package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0162Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0162;
import cn.biuaxia.odm.generate.service.Formmain0162Service;

@Service
public class Formmain0162ServiceImpl extends ServiceImpl<Formmain0162Mapper, Formmain0162> implements Formmain0162Service {

    @Override
    public int updateBatch(List<Formmain0162> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0162> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0162> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0162 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0162 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
