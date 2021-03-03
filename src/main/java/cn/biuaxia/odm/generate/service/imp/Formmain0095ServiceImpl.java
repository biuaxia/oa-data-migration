package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0095;
import cn.biuaxia.odm.generate.mapper.Formmain0095Mapper;
import cn.biuaxia.odm.generate.service.Formmain0095Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0095ServiceImpl extends ServiceImpl<Formmain0095Mapper, Formmain0095> implements Formmain0095Service {

    @Override
    public int batchInsert(List<Formmain0095> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0095 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0095 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
