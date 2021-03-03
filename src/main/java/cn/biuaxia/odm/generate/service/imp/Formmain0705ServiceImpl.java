package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0705;
import cn.biuaxia.odm.generate.mapper.Formmain0705Mapper;
import cn.biuaxia.odm.generate.service.Formmain0705Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0705ServiceImpl extends ServiceImpl<Formmain0705Mapper, Formmain0705> implements Formmain0705Service {

    @Override
    public int updateBatch(List<Formmain0705> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0705> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0705> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0705 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0705 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
