package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0002;
import cn.biuaxia.odm.generate.mapper.Formmain0002Mapper;
import cn.biuaxia.odm.generate.service.Formmain0002Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0002ServiceImpl extends ServiceImpl<Formmain0002Mapper, Formmain0002> implements Formmain0002Service {

    @Override
    public int batchInsert(List<Formmain0002> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0002 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0002 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
