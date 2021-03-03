package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0836;
import cn.biuaxia.odm.generate.mapper.Formmain0836Mapper;
import cn.biuaxia.odm.generate.service.Formmain0836Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0836ServiceImpl extends ServiceImpl<Formmain0836Mapper, Formmain0836> implements Formmain0836Service {

    @Override
    public int updateBatch(List<Formmain0836> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0836> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0836> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0836 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0836 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
