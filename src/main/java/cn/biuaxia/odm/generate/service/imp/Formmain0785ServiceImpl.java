package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0785;
import cn.biuaxia.odm.generate.mapper.Formmain0785Mapper;
import cn.biuaxia.odm.generate.service.Formmain0785Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0785ServiceImpl extends ServiceImpl<Formmain0785Mapper, Formmain0785> implements Formmain0785Service {

    @Override
    public int updateBatch(List<Formmain0785> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0785> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0785> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0785 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0785 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
