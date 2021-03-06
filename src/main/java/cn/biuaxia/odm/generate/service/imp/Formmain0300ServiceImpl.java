package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0300;
import cn.biuaxia.odm.generate.mapper.Formmain0300Mapper;
import cn.biuaxia.odm.generate.service.Formmain0300Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0300ServiceImpl extends ServiceImpl<Formmain0300Mapper, Formmain0300> implements Formmain0300Service {

    @Override
    public int updateBatch(List<Formmain0300> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0300> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0300> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0300 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0300 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
