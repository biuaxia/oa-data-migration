package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0006;
import cn.biuaxia.odm.generate.mapper.Formmain0006Mapper;
import cn.biuaxia.odm.generate.service.Formmain0006Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0006ServiceImpl extends ServiceImpl<Formmain0006Mapper, Formmain0006> implements Formmain0006Service {

    @Override
    public int batchInsert(List<Formmain0006> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0006 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0006 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
