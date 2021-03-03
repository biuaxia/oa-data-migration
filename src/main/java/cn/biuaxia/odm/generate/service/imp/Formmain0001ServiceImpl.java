package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0001;
import cn.biuaxia.odm.generate.mapper.Formmain0001Mapper;
import cn.biuaxia.odm.generate.service.Formmain0001Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0001ServiceImpl extends ServiceImpl<Formmain0001Mapper, Formmain0001> implements Formmain0001Service {

    @Override
    public int batchInsert(List<Formmain0001> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0001 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0001 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
