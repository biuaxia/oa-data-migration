package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0087;
import cn.biuaxia.odm.generate.mapper.Formmain0087Mapper;
import cn.biuaxia.odm.generate.service.Formmain0087Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0087ServiceImpl extends ServiceImpl<Formmain0087Mapper, Formmain0087> implements Formmain0087Service {

    @Override
    public int batchInsert(List<Formmain0087> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0087 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0087 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
