package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0756;
import cn.biuaxia.odm.generate.mapper.Formmain0756Mapper;
import cn.biuaxia.odm.generate.service.Formmain0756Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0756ServiceImpl extends ServiceImpl<Formmain0756Mapper, Formmain0756> implements Formmain0756Service {

    @Override
    public int updateBatch(List<Formmain0756> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0756> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0756> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0756 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0756 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
