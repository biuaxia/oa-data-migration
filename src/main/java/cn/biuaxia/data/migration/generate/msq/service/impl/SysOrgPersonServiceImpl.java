package cn.biuaxia.data.migration.generate.msq.service.impl;

import cn.biuaxia.data.migration.generate.msq.domain.SysOrgPerson;
import cn.biuaxia.data.migration.generate.msq.mapper.SysOrgPersonMapper;
import cn.biuaxia.data.migration.generate.msq.service.SysOrgPersonService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("msq")
public class SysOrgPersonServiceImpl extends ServiceImpl<SysOrgPersonMapper, SysOrgPerson> implements SysOrgPersonService {

    @Override
    public int updateBatch(List<SysOrgPerson> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<SysOrgPerson> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<SysOrgPerson> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(SysOrgPerson record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(SysOrgPerson record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
