package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0156;
import cn.biuaxia.odm.generate.mapper.Formmain0156Mapper;
import cn.biuaxia.odm.generate.service.Formmain0156Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0156ServiceImpl extends ServiceImpl<Formmain0156Mapper, Formmain0156> implements Formmain0156Service {

    @Override
    public int updateBatch(List<Formmain0156> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0156> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0156> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0156 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0156 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
