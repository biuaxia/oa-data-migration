package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0906;
import cn.biuaxia.odm.generate.mapper.Formmain0906Mapper;
import cn.biuaxia.odm.generate.service.Formmain0906Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0906ServiceImpl extends ServiceImpl<Formmain0906Mapper, Formmain0906> implements Formmain0906Service {

    @Override
    public int updateBatch(List<Formmain0906> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0906> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0906> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0906 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0906 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
