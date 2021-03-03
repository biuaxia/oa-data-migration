package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0815;
import cn.biuaxia.odm.generate.mapper.Formmain0815Mapper;
import cn.biuaxia.odm.generate.service.Formmain0815Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0815ServiceImpl extends ServiceImpl<Formmain0815Mapper, Formmain0815> implements Formmain0815Service {

    @Override
    public int updateBatch(List<Formmain0815> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0815> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0815> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0815 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0815 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
