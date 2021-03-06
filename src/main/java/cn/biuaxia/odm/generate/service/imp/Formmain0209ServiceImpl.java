package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0209;
import cn.biuaxia.odm.generate.mapper.Formmain0209Mapper;
import cn.biuaxia.odm.generate.service.Formmain0209Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0209ServiceImpl extends ServiceImpl<Formmain0209Mapper, Formmain0209> implements Formmain0209Service {

    @Override
    public int updateBatch(List<Formmain0209> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0209> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0209> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0209 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0209 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
