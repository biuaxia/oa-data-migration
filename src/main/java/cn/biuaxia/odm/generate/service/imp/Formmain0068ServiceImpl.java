package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0068Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0068;
import cn.biuaxia.odm.generate.service.Formmain0068Service;

@Service
public class Formmain0068ServiceImpl extends ServiceImpl<Formmain0068Mapper, Formmain0068> implements Formmain0068Service {

    @Override
    public int batchInsert(List<Formmain0068> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0068 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0068 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
