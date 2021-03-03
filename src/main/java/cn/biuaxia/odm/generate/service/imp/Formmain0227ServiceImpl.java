package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0227;
import cn.biuaxia.odm.generate.mapper.Formmain0227Mapper;
import cn.biuaxia.odm.generate.service.Formmain0227Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0227ServiceImpl extends ServiceImpl<Formmain0227Mapper, Formmain0227> implements Formmain0227Service {

    @Override
    public int updateBatch(List<Formmain0227> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0227> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0227> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0227 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0227 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
