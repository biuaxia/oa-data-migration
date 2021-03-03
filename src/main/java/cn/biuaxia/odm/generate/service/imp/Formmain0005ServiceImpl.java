package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0005;
import cn.biuaxia.odm.generate.mapper.Formmain0005Mapper;
import cn.biuaxia.odm.generate.service.Formmain0005Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0005ServiceImpl extends ServiceImpl<Formmain0005Mapper, Formmain0005> implements Formmain0005Service {

    @Override
    public int batchInsert(List<Formmain0005> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0005 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0005 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
