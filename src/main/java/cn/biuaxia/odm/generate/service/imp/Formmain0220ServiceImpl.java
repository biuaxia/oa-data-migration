package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0220;
import cn.biuaxia.odm.generate.mapper.Formmain0220Mapper;
import cn.biuaxia.odm.generate.service.Formmain0220Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0220ServiceImpl extends ServiceImpl<Formmain0220Mapper, Formmain0220> implements Formmain0220Service {

    @Override
    public int updateBatch(List<Formmain0220> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0220> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0220> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0220 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0220 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
