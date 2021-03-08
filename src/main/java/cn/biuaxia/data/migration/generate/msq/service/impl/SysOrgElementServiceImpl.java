package cn.biuaxia.data.migration.generate.msq.service.impl;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgElement;
import cn.biuaxia.data.migration.generate.msq.mapper.SysOrgElementMapper;
import cn.biuaxia.data.migration.generate.msq.service.SysOrgElementService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("msq")
public class SysOrgElementServiceImpl extends ServiceImpl<SysOrgElementMapper, SysOrgElement> implements SysOrgElementService {

    @Override
    public int updateBatch(List<SysOrgElement> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysOrgElement> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysOrgElement> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysOrgElement record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysOrgElement record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
