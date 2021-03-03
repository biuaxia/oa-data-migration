package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0898;
import cn.biuaxia.odm.generate.mapper.Formmain0898Mapper;
import cn.biuaxia.odm.generate.service.Formmain0898Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0898ServiceImpl extends ServiceImpl<Formmain0898Mapper, Formmain0898> implements Formmain0898Service {

    @Override
    public int updateBatch(List<Formmain0898> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0898> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0898> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0898 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0898 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
