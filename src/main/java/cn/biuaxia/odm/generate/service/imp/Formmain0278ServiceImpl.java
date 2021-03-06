package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0278;
import cn.biuaxia.odm.generate.mapper.Formmain0278Mapper;
import cn.biuaxia.odm.generate.service.Formmain0278Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0278ServiceImpl extends ServiceImpl<Formmain0278Mapper, Formmain0278> implements Formmain0278Service {

    @Override
    public int updateBatch(List<Formmain0278> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0278> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0278> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0278 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0278 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
