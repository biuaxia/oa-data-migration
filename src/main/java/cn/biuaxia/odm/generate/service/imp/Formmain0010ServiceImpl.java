package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0010;
import cn.biuaxia.odm.generate.mapper.Formmain0010Mapper;
import cn.biuaxia.odm.generate.service.Formmain0010Service;

@Service
public class Formmain0010ServiceImpl extends ServiceImpl<Formmain0010Mapper, Formmain0010> implements Formmain0010Service {

    @Override
    public int batchInsert(List<Formmain0010> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0010 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0010 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
