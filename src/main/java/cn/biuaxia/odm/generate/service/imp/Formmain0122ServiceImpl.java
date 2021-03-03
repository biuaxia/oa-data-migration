package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0122;
import cn.biuaxia.odm.generate.mapper.Formmain0122Mapper;
import cn.biuaxia.odm.generate.service.Formmain0122Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0122ServiceImpl extends ServiceImpl<Formmain0122Mapper, Formmain0122> implements Formmain0122Service {

    @Override
    public int batchInsert(List<Formmain0122> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0122 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0122 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
