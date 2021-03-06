package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0775;
import cn.biuaxia.odm.generate.mapper.Formmain0775Mapper;
import cn.biuaxia.odm.generate.service.Formmain0775Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0775ServiceImpl extends ServiceImpl<Formmain0775Mapper, Formmain0775> implements Formmain0775Service {

    @Override
    public int updateBatch(List<Formmain0775> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0775> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0775> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0775 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0775 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
