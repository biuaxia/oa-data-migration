package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0070Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0070;
import cn.biuaxia.odm.generate.service.Formmain0070Service;

@Service
public class Formmain0070ServiceImpl extends ServiceImpl<Formmain0070Mapper, Formmain0070> implements Formmain0070Service {

    @Override
    public int batchInsert(List<Formmain0070> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0070 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0070 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
