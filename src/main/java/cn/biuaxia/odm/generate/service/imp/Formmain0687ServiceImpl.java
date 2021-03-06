package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0687;
import cn.biuaxia.odm.generate.mapper.Formmain0687Mapper;
import cn.biuaxia.odm.generate.service.Formmain0687Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0687ServiceImpl extends ServiceImpl<Formmain0687Mapper, Formmain0687> implements Formmain0687Service {

    @Override
    public int updateBatch(List<Formmain0687> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0687> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0687> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0687 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0687 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
