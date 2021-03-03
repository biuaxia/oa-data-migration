package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0089;
import cn.biuaxia.odm.generate.mapper.Formmain0089Mapper;
import cn.biuaxia.odm.generate.service.Formmain0089Service;

@Service
public class Formmain0089ServiceImpl extends ServiceImpl<Formmain0089Mapper, Formmain0089> implements Formmain0089Service {

    @Override
    public int batchInsert(List<Formmain0089> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0089 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0089 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
