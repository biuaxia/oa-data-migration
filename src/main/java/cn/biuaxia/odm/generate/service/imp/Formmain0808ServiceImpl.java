package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.Formmain0808;
import cn.biuaxia.odm.generate.mapper.Formmain0808Mapper;
import cn.biuaxia.odm.generate.service.Formmain0808Service;

@Service
public class Formmain0808ServiceImpl extends ServiceImpl<Formmain0808Mapper, Formmain0808> implements Formmain0808Service {

    @Override
    public int updateBatch(List<Formmain0808> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<Formmain0808> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<Formmain0808> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(Formmain0808 record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Formmain0808 record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
