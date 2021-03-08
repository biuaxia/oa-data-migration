package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import cn.biuaxia.data.migration.generate.orcl.mapper.UmUserMapper;
import cn.biuaxia.data.migration.generate.orcl.service.UmUserService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class UmUserServiceImpl extends ServiceImpl<UmUserMapper, UmUser> implements UmUserService {

    @Override
    public int updateBatch(List<UmUser> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<UmUser> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<UmUser> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(UmUser record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(UmUser record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
