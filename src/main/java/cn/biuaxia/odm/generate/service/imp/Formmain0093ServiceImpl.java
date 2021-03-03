package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0093;
import cn.biuaxia.odm.generate.mapper.Formmain0093Mapper;
import cn.biuaxia.odm.generate.service.Formmain0093Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0093ServiceImpl extends ServiceImpl<Formmain0093Mapper, Formmain0093> implements Formmain0093Service {

    @Override
    public int batchInsert(List<Formmain0093> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0093 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0093 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
