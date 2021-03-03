package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0693;
import cn.biuaxia.odm.generate.mapper.Formmain0693Mapper;
import cn.biuaxia.odm.generate.service.Formmain0693Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0693ServiceImpl extends ServiceImpl<Formmain0693Mapper, Formmain0693> implements Formmain0693Service {

    @Override
    public int updateBatch(List<Formmain0693> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0693> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0693> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0693 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0693 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
