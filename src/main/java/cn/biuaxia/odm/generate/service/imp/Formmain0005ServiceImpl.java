package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.Formmain0005Mapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0005;
import cn.biuaxia.odm.generate.service.Formmain0005Service;

@Service
public class Formmain0005ServiceImpl extends ServiceImpl<Formmain0005Mapper, Formmain0005> implements Formmain0005Service {

    @Override
    public int batchInsert(List<Formmain0005> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0005 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0005 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
