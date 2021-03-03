package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0020Mapper;
import cn.biuaxia.odm.generate.domain.Formmain0020;
import cn.biuaxia.odm.generate.service.Formmain0020Service;

@Service
public class Formmain0020ServiceImpl extends ServiceImpl<Formmain0020Mapper, Formmain0020> implements Formmain0020Service {

    @Override
    public int batchInsert(List<Formmain0020> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0020 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0020 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
