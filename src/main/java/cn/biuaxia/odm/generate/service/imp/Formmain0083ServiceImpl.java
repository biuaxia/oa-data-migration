package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0083;
import cn.biuaxia.odm.generate.mapper.Formmain0083Mapper;
import cn.biuaxia.odm.generate.service.Formmain0083Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0083ServiceImpl extends ServiceImpl<Formmain0083Mapper, Formmain0083> implements Formmain0083Service {

    @Override
    public int batchInsert(List<Formmain0083> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0083 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0083 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
