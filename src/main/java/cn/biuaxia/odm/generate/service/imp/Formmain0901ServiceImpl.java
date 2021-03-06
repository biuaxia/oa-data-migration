package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0901;
import cn.biuaxia.odm.generate.mapper.Formmain0901Mapper;
import cn.biuaxia.odm.generate.service.Formmain0901Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0901ServiceImpl extends ServiceImpl<Formmain0901Mapper, Formmain0901> implements Formmain0901Service {

    @Override
    public int updateBatch(List<Formmain0901> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0901> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0901> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0901 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0901 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
