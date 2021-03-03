package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0912;
import cn.biuaxia.odm.generate.mapper.Formmain0912Mapper;
import cn.biuaxia.odm.generate.service.Formmain0912Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0912ServiceImpl extends ServiceImpl<Formmain0912Mapper, Formmain0912> implements Formmain0912Service {

    @Override
    public int updateBatch(List<Formmain0912> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0912> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0912> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0912 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0912 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
