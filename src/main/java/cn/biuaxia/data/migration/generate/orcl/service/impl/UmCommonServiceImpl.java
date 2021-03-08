package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import cn.biuaxia.data.migration.generate.orcl.mapper.UmCommonMapper;
import cn.biuaxia.data.migration.generate.orcl.service.UmCommonService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class UmCommonServiceImpl extends ServiceImpl<UmCommonMapper, UmCommon> implements UmCommonService {

    @Override
    public int updateBatch(List<UmCommon> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UmCommon> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UmCommon> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UmCommon record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmCommon record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
