package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0713;
import cn.biuaxia.odm.generate.mapper.Formmain0713Mapper;
import cn.biuaxia.odm.generate.service.Formmain0713Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0713ServiceImpl extends ServiceImpl<Formmain0713Mapper, Formmain0713> implements Formmain0713Service {

    @Override
    public int updateBatch(List<Formmain0713> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0713> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0713> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0713 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0713 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
