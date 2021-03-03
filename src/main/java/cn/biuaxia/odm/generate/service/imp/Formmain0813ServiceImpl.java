package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0813;
import cn.biuaxia.odm.generate.mapper.Formmain0813Mapper;
import cn.biuaxia.odm.generate.service.Formmain0813Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0813ServiceImpl extends ServiceImpl<Formmain0813Mapper, Formmain0813> implements Formmain0813Service {

    @Override
    public int updateBatch(List<Formmain0813> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0813> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0813> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0813 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0813 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
