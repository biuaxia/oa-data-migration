package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0857;
import cn.biuaxia.odm.generate.mapper.Formmain0857Mapper;
import cn.biuaxia.odm.generate.service.Formmain0857Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0857ServiceImpl extends ServiceImpl<Formmain0857Mapper, Formmain0857> implements Formmain0857Service {

    @Override
    public int updateBatch(List<Formmain0857> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0857> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0857> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0857 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0857 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
