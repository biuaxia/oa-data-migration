package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0302;
import cn.biuaxia.odm.generate.mapper.Formmain0302Mapper;
import cn.biuaxia.odm.generate.service.Formmain0302Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0302ServiceImpl extends ServiceImpl<Formmain0302Mapper, Formmain0302> implements Formmain0302Service {

    @Override
    public int updateBatch(List<Formmain0302> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0302> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0302> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0302 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0302 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
