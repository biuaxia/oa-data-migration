package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0703;
import cn.biuaxia.odm.generate.mapper.Formmain0703Mapper;
import cn.biuaxia.odm.generate.service.Formmain0703Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0703ServiceImpl extends ServiceImpl<Formmain0703Mapper, Formmain0703> implements Formmain0703Service {

    @Override
    public int updateBatch(List<Formmain0703> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0703> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0703> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0703 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0703 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
