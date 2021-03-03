package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0044Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0044;
import cn.biuaxia.odm.generate.service.Formmain0044Service;

@Service
public class Formmain0044ServiceImpl extends ServiceImpl<Formmain0044Mapper, Formmain0044> implements Formmain0044Service {

    @Override
    public int updateBatch(List<Formmain0044> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0044> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0044> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0044 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0044 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
