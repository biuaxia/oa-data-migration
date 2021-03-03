package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0099;
import cn.biuaxia.odm.generate.mapper.Formmain0099Mapper;
import cn.biuaxia.odm.generate.service.Formmain0099Service;

@Service
public class Formmain0099ServiceImpl extends ServiceImpl<Formmain0099Mapper, Formmain0099> implements Formmain0099Service {

    @Override
    public int batchInsert(List<Formmain0099> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0099 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0099 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
