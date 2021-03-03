package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0782;
import cn.biuaxia.odm.generate.mapper.Formmain0782Mapper;
import cn.biuaxia.odm.generate.service.Formmain0782Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0782ServiceImpl extends ServiceImpl<Formmain0782Mapper, Formmain0782> implements Formmain0782Service {

    @Override
    public int updateBatch(List<Formmain0782> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0782> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0782> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0782 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0782 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
