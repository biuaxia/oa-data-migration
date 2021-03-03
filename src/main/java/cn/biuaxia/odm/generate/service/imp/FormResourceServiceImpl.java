package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.FormResourceMapper;
import cn.biuaxia.odm.generate.domain.FormResource;
import cn.biuaxia.odm.generate.service.FormResourceService;

@Service
public class FormResourceServiceImpl extends ServiceImpl<FormResourceMapper, FormResource> implements FormResourceService {

    @Override
    public int updateBatch(List<FormResource> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<FormResource> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<FormResource> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(FormResource record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(FormResource record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
