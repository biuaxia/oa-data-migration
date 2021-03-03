package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0854;
import cn.biuaxia.odm.generate.mapper.Formmain0854Mapper;
import cn.biuaxia.odm.generate.service.Formmain0854Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0854ServiceImpl extends ServiceImpl<Formmain0854Mapper, Formmain0854> implements Formmain0854Service {

    @Override
    public int updateBatch(List<Formmain0854> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0854> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0854> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0854 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0854 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
