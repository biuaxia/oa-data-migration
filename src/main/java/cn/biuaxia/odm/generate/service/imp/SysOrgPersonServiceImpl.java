package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.biuaxia.odm.generate.mapper.SysOrgPersonMapper;
import cn.biuaxia.odm.generate.domain.SysOrgPerson;
import cn.biuaxia.odm.generate.service.SysOrgPersonService;
@Service
public class SysOrgPersonServiceImpl extends ServiceImpl<SysOrgPersonMapper, SysOrgPerson> implements SysOrgPersonService{

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
