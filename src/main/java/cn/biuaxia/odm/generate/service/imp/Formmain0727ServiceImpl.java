package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0727;
import cn.biuaxia.odm.generate.mapper.Formmain0727Mapper;
import cn.biuaxia.odm.generate.service.Formmain0727Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0727ServiceImpl extends ServiceImpl<Formmain0727Mapper, Formmain0727> implements Formmain0727Service {

    @Override
    public int updateBatch(List<Formmain0727> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0727> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0727> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0727 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0727 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
