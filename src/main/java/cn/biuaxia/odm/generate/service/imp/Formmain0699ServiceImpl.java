package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0699;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0699Mapper;
import cn.biuaxia.odm.generate.service.Formmain0699Service;

@Service
public class Formmain0699ServiceImpl extends ServiceImpl<Formmain0699Mapper, Formmain0699> implements Formmain0699Service {

    @Override
    public int updateBatch(List<Formmain0699> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0699> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0699> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0699 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0699 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
