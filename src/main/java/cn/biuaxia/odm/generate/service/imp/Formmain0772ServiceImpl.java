package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0772;
import cn.biuaxia.odm.generate.mapper.Formmain0772Mapper;
import cn.biuaxia.odm.generate.service.Formmain0772Service;

@Service
public class Formmain0772ServiceImpl extends ServiceImpl<Formmain0772Mapper, Formmain0772> implements Formmain0772Service {

    @Override
    public int updateBatch(List<Formmain0772> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0772> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0772> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0772 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0772 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
