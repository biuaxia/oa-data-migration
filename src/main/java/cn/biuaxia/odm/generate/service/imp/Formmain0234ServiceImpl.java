package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0234;
import cn.biuaxia.odm.generate.mapper.Formmain0234Mapper;
import cn.biuaxia.odm.generate.service.Formmain0234Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0234ServiceImpl extends ServiceImpl<Formmain0234Mapper, Formmain0234> implements Formmain0234Service {

    @Override
    public int updateBatch(List<Formmain0234> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0234> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0234> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0234 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0234 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
