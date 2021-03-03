package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0657;
import cn.biuaxia.odm.generate.mapper.Formmain0657Mapper;
import cn.biuaxia.odm.generate.service.Formmain0657Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0657ServiceImpl extends ServiceImpl<Formmain0657Mapper, Formmain0657> implements Formmain0657Service {

    @Override
    public int updateBatch(List<Formmain0657> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0657> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0657> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0657 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0657 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
