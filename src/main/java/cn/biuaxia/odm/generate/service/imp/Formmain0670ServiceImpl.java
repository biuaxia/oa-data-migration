package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0670;
import cn.biuaxia.odm.generate.mapper.Formmain0670Mapper;
import cn.biuaxia.odm.generate.service.Formmain0670Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0670ServiceImpl extends ServiceImpl<Formmain0670Mapper, Formmain0670> implements Formmain0670Service {

    @Override
    public int updateBatch(List<Formmain0670> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0670> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0670> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0670 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0670 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
