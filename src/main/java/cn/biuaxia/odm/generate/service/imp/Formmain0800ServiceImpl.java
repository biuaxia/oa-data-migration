package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0800;
import cn.biuaxia.odm.generate.mapper.Formmain0800Mapper;
import cn.biuaxia.odm.generate.service.Formmain0800Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0800ServiceImpl extends ServiceImpl<Formmain0800Mapper, Formmain0800> implements Formmain0800Service {

    @Override
    public int updateBatch(List<Formmain0800> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0800> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0800> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0800 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0800 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
