package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0729;
import cn.biuaxia.odm.generate.mapper.Formmain0729Mapper;
import cn.biuaxia.odm.generate.service.Formmain0729Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0729ServiceImpl extends ServiceImpl<Formmain0729Mapper, Formmain0729> implements Formmain0729Service {

    @Override
    public int updateBatch(List<Formmain0729> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0729> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0729> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0729 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0729 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
