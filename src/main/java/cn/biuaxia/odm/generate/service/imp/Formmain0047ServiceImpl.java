package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0047;
import cn.biuaxia.odm.generate.mapper.Formmain0047Mapper;
import cn.biuaxia.odm.generate.service.Formmain0047Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0047ServiceImpl extends ServiceImpl<Formmain0047Mapper, Formmain0047> implements Formmain0047Service {

    @Override
    public int batchInsert(List<Formmain0047> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0047 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0047 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
