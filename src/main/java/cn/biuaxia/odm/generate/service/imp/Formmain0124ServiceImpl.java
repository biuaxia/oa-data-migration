package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0124;
import cn.biuaxia.odm.generate.mapper.Formmain0124Mapper;
import cn.biuaxia.odm.generate.service.Formmain0124Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0124ServiceImpl extends ServiceImpl<Formmain0124Mapper, Formmain0124> implements Formmain0124Service {

    @Override
    public int batchInsert(List<Formmain0124> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0124 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0124 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
