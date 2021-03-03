package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0526;
import cn.biuaxia.odm.generate.mapper.Formmain0526Mapper;
import cn.biuaxia.odm.generate.service.Formmain0526Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0526ServiceImpl extends ServiceImpl<Formmain0526Mapper, Formmain0526> implements Formmain0526Service {

    @Override
    public int updateBatch(List<Formmain0526> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0526> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0526> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0526 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0526 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
