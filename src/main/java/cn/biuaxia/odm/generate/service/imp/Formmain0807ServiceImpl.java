package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0807;
import cn.biuaxia.odm.generate.mapper.Formmain0807Mapper;
import cn.biuaxia.odm.generate.service.Formmain0807Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0807ServiceImpl extends ServiceImpl<Formmain0807Mapper, Formmain0807> implements Formmain0807Service {

    @Override
    public int updateBatch(List<Formmain0807> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0807> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0807> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0807 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0807 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
