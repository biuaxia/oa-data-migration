package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0016;
import cn.biuaxia.odm.generate.mapper.Formmain0016Mapper;
import cn.biuaxia.odm.generate.service.Formmain0016Service;

@Service
public class Formmain0016ServiceImpl extends ServiceImpl<Formmain0016Mapper, Formmain0016> implements Formmain0016Service {

    @Override
    public int batchInsert(List<Formmain0016> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0016 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0016 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
