package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0008Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0008;
import cn.biuaxia.odm.generate.service.Formmain0008Service;

@Service
public class Formmain0008ServiceImpl extends ServiceImpl<Formmain0008Mapper, Formmain0008> implements Formmain0008Service {

    @Override
    public int batchInsert(List<Formmain0008> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0008 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0008 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
