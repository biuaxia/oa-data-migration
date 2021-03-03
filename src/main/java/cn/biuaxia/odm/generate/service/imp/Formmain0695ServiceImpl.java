package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0695;
import cn.biuaxia.odm.generate.mapper.Formmain0695Mapper;
import cn.biuaxia.odm.generate.service.Formmain0695Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0695ServiceImpl extends ServiceImpl<Formmain0695Mapper, Formmain0695> implements Formmain0695Service {

    @Override
    public int updateBatch(List<Formmain0695> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0695> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0695> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0695 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0695 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
