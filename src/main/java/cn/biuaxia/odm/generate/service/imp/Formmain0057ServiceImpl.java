package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0057;
import cn.biuaxia.odm.generate.mapper.Formmain0057Mapper;
import cn.biuaxia.odm.generate.service.Formmain0057Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0057ServiceImpl extends ServiceImpl<Formmain0057Mapper, Formmain0057> implements Formmain0057Service {

    @Override
    public int batchInsert(List<Formmain0057> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0057 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0057 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
