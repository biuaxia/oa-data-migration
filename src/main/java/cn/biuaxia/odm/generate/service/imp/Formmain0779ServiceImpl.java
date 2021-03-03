package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0779Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0779;
import cn.biuaxia.odm.generate.service.Formmain0779Service;

@Service
public class Formmain0779ServiceImpl extends ServiceImpl<Formmain0779Mapper, Formmain0779> implements Formmain0779Service {

    @Override
    public int updateBatch(List<Formmain0779> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0779> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0779> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0779 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0779 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
