package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.UmGroup;
import cn.biuaxia.data.migration.generate.orcl.mapper.UmGroupMapper;
import cn.biuaxia.data.migration.generate.orcl.service.UmGroupService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class UmGroupServiceImpl extends ServiceImpl<UmGroupMapper, UmGroup> implements UmGroupService {

    @Override
    public int updateBatch(List<UmGroup> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UmGroup> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UmGroup> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UmGroup record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmGroup record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
