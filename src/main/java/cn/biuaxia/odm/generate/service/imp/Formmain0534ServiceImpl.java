package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0534;
import cn.biuaxia.odm.generate.mapper.Formmain0534Mapper;
import cn.biuaxia.odm.generate.service.Formmain0534Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0534ServiceImpl extends ServiceImpl<Formmain0534Mapper, Formmain0534> implements Formmain0534Service {

    @Override
    public int updateBatch(List<Formmain0534> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0534> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0534> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0534 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0534 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
