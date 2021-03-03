package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0305;
import cn.biuaxia.odm.generate.mapper.Formmain0305Mapper;
import cn.biuaxia.odm.generate.service.Formmain0305Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0305ServiceImpl extends ServiceImpl<Formmain0305Mapper, Formmain0305> implements Formmain0305Service {

    @Override
    public int updateBatch(List<Formmain0305> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0305> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0305> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0305 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0305 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
