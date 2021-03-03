package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0718;
import cn.biuaxia.odm.generate.mapper.Formmain0718Mapper;
import cn.biuaxia.odm.generate.service.Formmain0718Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0718ServiceImpl extends ServiceImpl<Formmain0718Mapper, Formmain0718> implements Formmain0718Service {

    @Override
    public int updateBatch(List<Formmain0718> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0718> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0718> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0718 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0718 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
