package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0659;
import cn.biuaxia.odm.generate.mapper.Formmain0659Mapper;
import cn.biuaxia.odm.generate.service.Formmain0659Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0659ServiceImpl extends ServiceImpl<Formmain0659Mapper, Formmain0659> implements Formmain0659Service {

    @Override
    public int updateBatch(List<Formmain0659> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0659> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0659> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0659 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0659 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
