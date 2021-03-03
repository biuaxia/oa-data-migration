package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0037;
import cn.biuaxia.odm.generate.mapper.Formmain0037Mapper;
import cn.biuaxia.odm.generate.service.Formmain0037Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0037ServiceImpl extends ServiceImpl<Formmain0037Mapper, Formmain0037> implements Formmain0037Service {

    @Override
    public int batchInsert(List<Formmain0037> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0037 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0037 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
