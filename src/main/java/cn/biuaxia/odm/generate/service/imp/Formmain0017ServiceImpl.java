package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0017;
import cn.biuaxia.odm.generate.mapper.Formmain0017Mapper;
import cn.biuaxia.odm.generate.service.Formmain0017Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0017ServiceImpl extends ServiceImpl<Formmain0017Mapper, Formmain0017> implements Formmain0017Service {

    @Override
    public int updateBatch(List<Formmain0017> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0017> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0017> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0017 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0017 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
