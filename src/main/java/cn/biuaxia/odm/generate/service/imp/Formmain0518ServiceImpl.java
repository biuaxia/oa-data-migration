package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0518;
import cn.biuaxia.odm.generate.mapper.Formmain0518Mapper;
import cn.biuaxia.odm.generate.service.Formmain0518Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0518ServiceImpl extends ServiceImpl<Formmain0518Mapper, Formmain0518> implements Formmain0518Service {

    @Override
    public int updateBatch(List<Formmain0518> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0518> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0518> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0518 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0518 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
