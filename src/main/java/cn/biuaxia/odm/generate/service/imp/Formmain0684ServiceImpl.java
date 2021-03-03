package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0684Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0684;
import cn.biuaxia.odm.generate.service.Formmain0684Service;

@Service
public class Formmain0684ServiceImpl extends ServiceImpl<Formmain0684Mapper, Formmain0684> implements Formmain0684Service {

    @Override
    public int updateBatch(List<Formmain0684> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0684> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0684> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0684 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0684 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
