package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0696Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0696;
import cn.biuaxia.odm.generate.service.Formmain0696Service;

@Service
public class Formmain0696ServiceImpl extends ServiceImpl<Formmain0696Mapper, Formmain0696> implements Formmain0696Service {

    @Override
    public int updateBatch(List<Formmain0696> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0696> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0696> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0696 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0696 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
