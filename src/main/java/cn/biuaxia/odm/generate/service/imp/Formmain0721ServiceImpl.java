package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0721;
import cn.biuaxia.odm.generate.mapper.Formmain0721Mapper;
import cn.biuaxia.odm.generate.service.Formmain0721Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0721ServiceImpl extends ServiceImpl<Formmain0721Mapper, Formmain0721> implements Formmain0721Service {

    @Override
    public int updateBatch(List<Formmain0721> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0721> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0721> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0721 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0721 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
