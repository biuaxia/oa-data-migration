package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0765;
import cn.biuaxia.odm.generate.mapper.Formmain0765Mapper;
import cn.biuaxia.odm.generate.service.Formmain0765Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0765ServiceImpl extends ServiceImpl<Formmain0765Mapper, Formmain0765> implements Formmain0765Service {

    @Override
    public int updateBatch(List<Formmain0765> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0765> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0765> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0765 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0765 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
