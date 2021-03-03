package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0868;
import cn.biuaxia.odm.generate.mapper.Formmain0868Mapper;
import cn.biuaxia.odm.generate.service.Formmain0868Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0868ServiceImpl extends ServiceImpl<Formmain0868Mapper, Formmain0868> implements Formmain0868Service {

    @Override
    public int updateBatch(List<Formmain0868> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0868> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0868> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0868 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0868 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
