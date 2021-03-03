package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0715;
import cn.biuaxia.odm.generate.mapper.Formmain0715Mapper;
import cn.biuaxia.odm.generate.service.Formmain0715Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0715ServiceImpl extends ServiceImpl<Formmain0715Mapper, Formmain0715> implements Formmain0715Service {

    @Override
    public int updateBatch(List<Formmain0715> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0715> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0715> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0715 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0715 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
