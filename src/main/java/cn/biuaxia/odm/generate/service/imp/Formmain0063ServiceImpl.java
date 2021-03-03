package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0063;
import cn.biuaxia.odm.generate.mapper.Formmain0063Mapper;
import cn.biuaxia.odm.generate.service.Formmain0063Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0063ServiceImpl extends ServiceImpl<Formmain0063Mapper, Formmain0063> implements Formmain0063Service {

    @Override
    public int batchInsert(List<Formmain0063> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0063 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0063 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
