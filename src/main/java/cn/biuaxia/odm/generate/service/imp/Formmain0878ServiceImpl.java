package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0878;
import cn.biuaxia.odm.generate.mapper.Formmain0878Mapper;
import cn.biuaxia.odm.generate.service.Formmain0878Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0878ServiceImpl extends ServiceImpl<Formmain0878Mapper, Formmain0878> implements Formmain0878Service {

    @Override
    public int updateBatch(List<Formmain0878> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0878> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0878> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0878 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0878 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
