package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0003;
import cn.biuaxia.odm.generate.mapper.Formmain0003Mapper;
import cn.biuaxia.odm.generate.service.Formmain0003Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0003ServiceImpl extends ServiceImpl<Formmain0003Mapper, Formmain0003> implements Formmain0003Service {

    @Override
    public int batchInsert(List<Formmain0003> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0003 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0003 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
