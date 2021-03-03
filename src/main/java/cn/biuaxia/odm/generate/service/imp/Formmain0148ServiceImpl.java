package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0148;
import cn.biuaxia.odm.generate.mapper.Formmain0148Mapper;
import cn.biuaxia.odm.generate.service.Formmain0148Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0148ServiceImpl extends ServiceImpl<Formmain0148Mapper, Formmain0148> implements Formmain0148Service {

    @Override
    public int batchInsert(List<Formmain0148> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0148 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0148 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
