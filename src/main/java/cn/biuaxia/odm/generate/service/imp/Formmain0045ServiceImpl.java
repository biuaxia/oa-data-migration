package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.Formmain0045;
import cn.biuaxia.odm.generate.mapper.Formmain0045Mapper;
import cn.biuaxia.odm.generate.service.Formmain0045Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formmain0045ServiceImpl extends ServiceImpl<Formmain0045Mapper, Formmain0045> implements Formmain0045Service {

    @Override
    public int batchInsert(List<Formmain0045> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0045 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0045 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
