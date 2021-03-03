package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0015Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0015;
import cn.biuaxia.odm.generate.service.Formmain0015Service;

@Service
public class Formmain0015ServiceImpl extends ServiceImpl<Formmain0015Mapper, Formmain0015> implements Formmain0015Service {

    @Override
    public int batchInsert(List<Formmain0015> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0015 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0015 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
