package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.OrgUnit;
import cn.biuaxia.odm.generate.mapper.OrgUnitMapper;
import cn.biuaxia.odm.generate.service.OrgUnitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgUnitServiceImpl extends ServiceImpl<OrgUnitMapper, OrgUnit> implements OrgUnitService {

    @Override
    public int updateBatch(List<OrgUnit> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<OrgUnit> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<OrgUnit> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OrgUnit record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OrgUnit record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
