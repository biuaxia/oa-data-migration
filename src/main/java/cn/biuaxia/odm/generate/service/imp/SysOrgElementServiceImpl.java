package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.biuaxia.odm.generate.mapper.SysOrgElementMapper;
import cn.biuaxia.odm.generate.domain.SysOrgElement;
import cn.biuaxia.odm.generate.service.SysOrgElementService;
@Service
public class SysOrgElementServiceImpl extends ServiceImpl<SysOrgElementMapper, SysOrgElement> implements SysOrgElementService{

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
