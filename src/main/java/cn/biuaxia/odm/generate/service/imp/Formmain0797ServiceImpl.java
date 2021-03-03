package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0797;
import cn.biuaxia.odm.generate.mapper.Formmain0797Mapper;
import cn.biuaxia.odm.generate.service.Formmain0797Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0797ServiceImpl extends ServiceImpl<Formmain0797Mapper, Formmain0797> implements Formmain0797Service {

    @Override
    public int updateBatch(List<Formmain0797> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0797> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0797> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0797 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0797 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
