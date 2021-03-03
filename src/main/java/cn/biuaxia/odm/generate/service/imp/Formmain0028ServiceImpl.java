package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.Formmain0028;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.Formmain0028Mapper;
import cn.biuaxia.odm.generate.service.Formmain0028Service;

@Service
public class Formmain0028ServiceImpl extends ServiceImpl<Formmain0028Mapper, Formmain0028> implements Formmain0028Service {

    @Override
    public int batchInsert(List<Formmain0028> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0028 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0028 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
