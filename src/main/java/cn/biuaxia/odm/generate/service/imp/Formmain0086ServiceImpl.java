package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0086;
import cn.biuaxia.odm.generate.mapper.Formmain0086Mapper;
import cn.biuaxia.odm.generate.service.Formmain0086Service;

@Service
public class Formmain0086ServiceImpl extends ServiceImpl<Formmain0086Mapper, Formmain0086> implements Formmain0086Service {

    @Override
    public int batchInsert(List<Formmain0086> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0086 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0086 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
