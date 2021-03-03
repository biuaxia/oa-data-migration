package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0205;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0205Mapper;
import cn.biuaxia.odm.generate.service.Formmain0205Service;

@Service
public class Formmain0205ServiceImpl extends ServiceImpl<Formmain0205Mapper, Formmain0205> implements Formmain0205Service {

    @Override
    public int updateBatch(List<Formmain0205> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0205> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0205> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0205 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0205 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
