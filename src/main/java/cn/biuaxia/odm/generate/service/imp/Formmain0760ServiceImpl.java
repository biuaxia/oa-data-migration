package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0760;
import cn.biuaxia.odm.generate.mapper.Formmain0760Mapper;
import cn.biuaxia.odm.generate.service.Formmain0760Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0760ServiceImpl extends ServiceImpl<Formmain0760Mapper, Formmain0760> implements Formmain0760Service {

    @Override
    public int updateBatch(List<Formmain0760> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0760> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0760> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0760 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0760 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
