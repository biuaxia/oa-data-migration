package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0009;
import cn.biuaxia.odm.generate.mapper.Formmain0009Mapper;
import cn.biuaxia.odm.generate.service.Formmain0009Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0009ServiceImpl extends ServiceImpl<Formmain0009Mapper, Formmain0009> implements Formmain0009Service {

    @Override
    public int batchInsert(List<Formmain0009> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0009 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0009 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
