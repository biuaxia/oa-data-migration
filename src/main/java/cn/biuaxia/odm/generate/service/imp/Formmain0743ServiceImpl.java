package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0743;
import cn.biuaxia.odm.generate.mapper.Formmain0743Mapper;
import cn.biuaxia.odm.generate.service.Formmain0743Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0743ServiceImpl extends ServiceImpl<Formmain0743Mapper, Formmain0743> implements Formmain0743Service {

    @Override
    public int updateBatch(List<Formmain0743> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0743> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0743> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0743 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0743 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
