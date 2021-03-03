package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0846;
import cn.biuaxia.odm.generate.mapper.Formmain0846Mapper;
import cn.biuaxia.odm.generate.service.Formmain0846Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0846ServiceImpl extends ServiceImpl<Formmain0846Mapper, Formmain0846> implements Formmain0846Service {

    @Override
    public int updateBatch(List<Formmain0846> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0846> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0846> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0846 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0846 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
