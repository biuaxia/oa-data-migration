package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0019;
import cn.biuaxia.odm.generate.mapper.Formmain0019Mapper;
import cn.biuaxia.odm.generate.service.Formmain0019Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0019ServiceImpl extends ServiceImpl<Formmain0019Mapper, Formmain0019> implements Formmain0019Service {

    @Override
    public int batchInsert(List<Formmain0019> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0019 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0019 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
