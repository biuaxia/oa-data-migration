package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0004;
import cn.biuaxia.odm.generate.mapper.Formmain0004Mapper;
import cn.biuaxia.odm.generate.service.Formmain0004Service;

@Service
public class Formmain0004ServiceImpl extends ServiceImpl<Formmain0004Mapper, Formmain0004> implements Formmain0004Service {

    @Override
    public int batchInsert(List<Formmain0004> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0004 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0004 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
