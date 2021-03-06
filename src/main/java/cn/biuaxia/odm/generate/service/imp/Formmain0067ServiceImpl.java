package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0067;
import cn.biuaxia.odm.generate.mapper.Formmain0067Mapper;
import cn.biuaxia.odm.generate.service.Formmain0067Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0067ServiceImpl extends ServiceImpl<Formmain0067Mapper, Formmain0067> implements Formmain0067Service {

    @Override
    public int batchInsert(List<Formmain0067> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0067 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0067 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
