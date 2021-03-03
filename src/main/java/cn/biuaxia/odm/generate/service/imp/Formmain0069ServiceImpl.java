package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0069;
import cn.biuaxia.odm.generate.mapper.Formmain0069Mapper;
import cn.biuaxia.odm.generate.service.Formmain0069Service;

@Service
public class Formmain0069ServiceImpl extends ServiceImpl<Formmain0069Mapper, Formmain0069> implements Formmain0069Service {

    @Override
    public int batchInsert(List<Formmain0069> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0069 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0069 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
