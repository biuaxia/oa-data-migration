package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0735;
import cn.biuaxia.odm.generate.mapper.Formmain0735Mapper;
import cn.biuaxia.odm.generate.service.Formmain0735Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0735ServiceImpl extends ServiceImpl<Formmain0735Mapper, Formmain0735> implements Formmain0735Service {

    @Override
    public int updateBatch(List<Formmain0735> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0735> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0735> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0735 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0735 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
