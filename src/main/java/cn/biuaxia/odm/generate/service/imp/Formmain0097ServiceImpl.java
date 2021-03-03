package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0097;
import cn.biuaxia.odm.generate.mapper.Formmain0097Mapper;
import cn.biuaxia.odm.generate.service.Formmain0097Service;

@Service
public class Formmain0097ServiceImpl extends ServiceImpl<Formmain0097Mapper, Formmain0097> implements Formmain0097Service {

    @Override
    public int batchInsert(List<Formmain0097> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0097 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0097 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
