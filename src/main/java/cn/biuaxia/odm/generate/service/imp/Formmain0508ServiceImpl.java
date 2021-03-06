package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0508;
import cn.biuaxia.odm.generate.mapper.Formmain0508Mapper;
import cn.biuaxia.odm.generate.service.Formmain0508Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0508ServiceImpl extends ServiceImpl<Formmain0508Mapper, Formmain0508> implements Formmain0508Service {

    @Override
    public int updateBatch(List<Formmain0508> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0508> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0508> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0508 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0508 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
