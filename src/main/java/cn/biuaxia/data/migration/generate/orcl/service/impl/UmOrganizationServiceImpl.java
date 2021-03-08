package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.UmOrganization;
import cn.biuaxia.data.migration.generate.orcl.mapper.UmOrganizationMapper;
import cn.biuaxia.data.migration.generate.orcl.service.UmOrganizationService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class UmOrganizationServiceImpl extends ServiceImpl<UmOrganizationMapper, UmOrganization> implements UmOrganizationService {

    @Override
    public int updateBatch(List<UmOrganization> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UmOrganization> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UmOrganization> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UmOrganization record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmOrganization record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
