package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0014;
import cn.biuaxia.odm.generate.mapper.Formmain0014Mapper;
import cn.biuaxia.odm.generate.service.Formmain0014Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0014ServiceImpl extends ServiceImpl<Formmain0014Mapper, Formmain0014> implements Formmain0014Service {

    @Override
    public int batchInsert(List<Formmain0014> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0014 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0014 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
