package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0801;
import cn.biuaxia.odm.generate.mapper.Formmain0801Mapper;
import cn.biuaxia.odm.generate.service.Formmain0801Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0801ServiceImpl extends ServiceImpl<Formmain0801Mapper, Formmain0801> implements Formmain0801Service {

    @Override
    public int updateBatch(List<Formmain0801> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0801> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0801> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0801 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0801 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
