package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0686;
import cn.biuaxia.odm.generate.mapper.Formmain0686Mapper;
import cn.biuaxia.odm.generate.service.Formmain0686Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0686ServiceImpl extends ServiceImpl<Formmain0686Mapper, Formmain0686> implements Formmain0686Service {

    @Override
    public int updateBatch(List<Formmain0686> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0686> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0686> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0686 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0686 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
