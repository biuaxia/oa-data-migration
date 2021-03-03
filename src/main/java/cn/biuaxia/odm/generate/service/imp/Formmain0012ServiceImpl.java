package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0012Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0012;
import cn.biuaxia.odm.generate.service.Formmain0012Service;

@Service
public class Formmain0012ServiceImpl extends ServiceImpl<Formmain0012Mapper, Formmain0012> implements Formmain0012Service {

    @Override
    public int batchInsert(List<Formmain0012> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0012 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0012 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
