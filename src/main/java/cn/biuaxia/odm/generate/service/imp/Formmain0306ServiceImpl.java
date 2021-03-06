package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0306;
import cn.biuaxia.odm.generate.mapper.Formmain0306Mapper;
import cn.biuaxia.odm.generate.service.Formmain0306Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0306ServiceImpl extends ServiceImpl<Formmain0306Mapper, Formmain0306> implements Formmain0306Service {

    @Override
    public int updateBatch(List<Formmain0306> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0306> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0306> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0306 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0306 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
