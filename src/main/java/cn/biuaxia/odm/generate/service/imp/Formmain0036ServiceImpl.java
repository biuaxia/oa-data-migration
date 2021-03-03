package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0036;
import cn.biuaxia.odm.generate.mapper.Formmain0036Mapper;
import cn.biuaxia.odm.generate.service.Formmain0036Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0036ServiceImpl extends ServiceImpl<Formmain0036Mapper, Formmain0036> implements Formmain0036Service {

    @Override
    public int batchInsert(List<Formmain0036> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0036 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0036 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
