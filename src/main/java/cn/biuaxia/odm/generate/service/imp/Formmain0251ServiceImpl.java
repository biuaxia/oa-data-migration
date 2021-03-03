package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0251;
import cn.biuaxia.odm.generate.mapper.Formmain0251Mapper;
import cn.biuaxia.odm.generate.service.Formmain0251Service;

@Service
public class Formmain0251ServiceImpl extends ServiceImpl<Formmain0251Mapper, Formmain0251> implements Formmain0251Service {

    @Override
    public int updateBatch(List<Formmain0251> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0251> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0251> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0251 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0251 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
