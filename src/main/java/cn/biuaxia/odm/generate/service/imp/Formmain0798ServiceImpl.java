package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0798;
import cn.biuaxia.odm.generate.mapper.Formmain0798Mapper;
import cn.biuaxia.odm.generate.service.Formmain0798Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0798ServiceImpl extends ServiceImpl<Formmain0798Mapper, Formmain0798> implements Formmain0798Service {

    @Override
    public int updateBatch(List<Formmain0798> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0798> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0798> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0798 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0798 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
