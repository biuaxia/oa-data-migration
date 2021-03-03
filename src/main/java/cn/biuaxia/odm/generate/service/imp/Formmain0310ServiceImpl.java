package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0310;
import cn.biuaxia.odm.generate.mapper.Formmain0310Mapper;
import cn.biuaxia.odm.generate.service.Formmain0310Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0310ServiceImpl extends ServiceImpl<Formmain0310Mapper, Formmain0310> implements Formmain0310Service {

    @Override
    public int updateBatch(List<Formmain0310> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0310> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0310> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0310 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0310 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
