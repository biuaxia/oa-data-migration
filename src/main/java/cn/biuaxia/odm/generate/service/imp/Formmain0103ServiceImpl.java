package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0103;
import cn.biuaxia.odm.generate.mapper.Formmain0103Mapper;
import cn.biuaxia.odm.generate.service.Formmain0103Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0103ServiceImpl extends ServiceImpl<Formmain0103Mapper, Formmain0103> implements Formmain0103Service {

    @Override
    public int batchInsert(List<Formmain0103> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0103 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0103 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
