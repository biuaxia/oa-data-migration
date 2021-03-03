package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0784;
import cn.biuaxia.odm.generate.mapper.Formmain0784Mapper;
import cn.biuaxia.odm.generate.service.Formmain0784Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0784ServiceImpl extends ServiceImpl<Formmain0784Mapper, Formmain0784> implements Formmain0784Service {

    @Override
    public int updateBatch(List<Formmain0784> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0784> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0784> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0784 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0784 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
