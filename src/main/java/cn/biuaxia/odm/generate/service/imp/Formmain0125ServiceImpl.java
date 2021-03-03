package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0125;
import cn.biuaxia.odm.generate.mapper.Formmain0125Mapper;
import cn.biuaxia.odm.generate.service.Formmain0125Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0125ServiceImpl extends ServiceImpl<Formmain0125Mapper, Formmain0125> implements Formmain0125Service {

    @Override
    public int batchInsert(List<Formmain0125> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0125 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0125 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
