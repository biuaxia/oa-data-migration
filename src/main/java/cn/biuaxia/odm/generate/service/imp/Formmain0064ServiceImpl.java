package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0064;
import cn.biuaxia.odm.generate.mapper.Formmain0064Mapper;
import cn.biuaxia.odm.generate.service.Formmain0064Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0064ServiceImpl extends ServiceImpl<Formmain0064Mapper, Formmain0064> implements Formmain0064Service {

    @Override
    public int batchInsert(List<Formmain0064> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0064 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0064 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
