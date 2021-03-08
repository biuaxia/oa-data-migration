package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.UmLeader;
import cn.biuaxia.data.migration.generate.orcl.mapper.UmLeaderMapper;
import cn.biuaxia.data.migration.generate.orcl.service.UmLeaderService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class UmLeaderServiceImpl extends ServiceImpl<UmLeaderMapper, UmLeader> implements UmLeaderService {

    @Override
    public int updateBatch(List<UmLeader> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UmLeader> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UmLeader> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UmLeader record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmLeader record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
