package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0910;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0910Mapper;
import cn.biuaxia.odm.generate.service.Formmain0910Service;

@Service
public class Formmain0910ServiceImpl extends ServiceImpl<Formmain0910Mapper, Formmain0910> implements Formmain0910Service {

    @Override
    public int updateBatch(List<Formmain0910> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0910> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0910> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0910 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0910 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
