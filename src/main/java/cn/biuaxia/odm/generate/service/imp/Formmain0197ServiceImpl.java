package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0197;
import cn.biuaxia.odm.generate.mapper.Formmain0197Mapper;
import cn.biuaxia.odm.generate.service.Formmain0197Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0197ServiceImpl extends ServiceImpl<Formmain0197Mapper, Formmain0197> implements Formmain0197Service {

    @Override
    public int updateBatch(List<Formmain0197> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0197> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0197> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0197 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0197 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
