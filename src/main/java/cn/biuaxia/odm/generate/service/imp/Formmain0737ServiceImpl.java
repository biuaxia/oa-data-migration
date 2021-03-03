package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0737Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0737;
import cn.biuaxia.odm.generate.service.Formmain0737Service;

@Service
public class Formmain0737ServiceImpl extends ServiceImpl<Formmain0737Mapper, Formmain0737> implements Formmain0737Service {

    @Override
    public int updateBatch(List<Formmain0737> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0737> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0737> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0737 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0737 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
