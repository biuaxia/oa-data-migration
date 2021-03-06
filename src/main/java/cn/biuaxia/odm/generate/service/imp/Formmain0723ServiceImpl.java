package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0723;
import cn.biuaxia.odm.generate.mapper.Formmain0723Mapper;
import cn.biuaxia.odm.generate.service.Formmain0723Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0723ServiceImpl extends ServiceImpl<Formmain0723Mapper, Formmain0723> implements Formmain0723Service {

    @Override
    public int updateBatch(List<Formmain0723> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0723> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0723> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0723 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0723 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
