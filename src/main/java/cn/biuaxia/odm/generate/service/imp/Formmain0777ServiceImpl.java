package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0777;
import cn.biuaxia.odm.generate.mapper.Formmain0777Mapper;
import cn.biuaxia.odm.generate.service.Formmain0777Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0777ServiceImpl extends ServiceImpl<Formmain0777Mapper, Formmain0777> implements Formmain0777Service {

    @Override
    public int updateBatch(List<Formmain0777> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0777> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0777> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0777 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0777 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
