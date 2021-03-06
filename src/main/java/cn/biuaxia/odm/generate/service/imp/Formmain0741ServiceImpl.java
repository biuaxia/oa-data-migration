package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0741;
import cn.biuaxia.odm.generate.mapper.Formmain0741Mapper;
import cn.biuaxia.odm.generate.service.Formmain0741Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0741ServiceImpl extends ServiceImpl<Formmain0741Mapper, Formmain0741> implements Formmain0741Service {

    @Override
    public int updateBatch(List<Formmain0741> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0741> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0741> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0741 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0741 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
