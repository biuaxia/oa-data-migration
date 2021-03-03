package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0018;
import cn.biuaxia.odm.generate.mapper.Formmain0018Mapper;
import cn.biuaxia.odm.generate.service.Formmain0018Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0018ServiceImpl extends ServiceImpl<Formmain0018Mapper, Formmain0018> implements Formmain0018Service {

    @Override
    public int batchInsert(List<Formmain0018> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0018 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0018 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
