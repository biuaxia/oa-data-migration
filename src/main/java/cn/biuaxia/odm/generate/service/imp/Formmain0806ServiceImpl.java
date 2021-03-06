package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0806;
import cn.biuaxia.odm.generate.mapper.Formmain0806Mapper;
import cn.biuaxia.odm.generate.service.Formmain0806Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0806ServiceImpl extends ServiceImpl<Formmain0806Mapper, Formmain0806> implements Formmain0806Service {

    @Override
    public int updateBatch(List<Formmain0806> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0806> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0806> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0806 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0806 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
