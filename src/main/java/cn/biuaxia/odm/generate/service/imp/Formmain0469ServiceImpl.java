package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0469;
import cn.biuaxia.odm.generate.mapper.Formmain0469Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.service.Formmain0469Service;

@Service
public class Formmain0469ServiceImpl extends ServiceImpl<Formmain0469Mapper, Formmain0469> implements Formmain0469Service {

    @Override
    public int updateBatch(List<Formmain0469> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0469> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0469> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0469 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0469 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
