package cn.biuaxia.odm.generate.service.imp;

import cn.biuaxia.odm.generate.domain.CtpTemplate;
import cn.biuaxia.odm.generate.mapper.CtpTemplateMapper;
import cn.biuaxia.odm.generate.service.CtpTemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtpTemplateServiceImpl extends ServiceImpl<CtpTemplateMapper, CtpTemplate> implements CtpTemplateService {

    @Override
    public int updateBatch(List<CtpTemplate> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpTemplate> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpTemplate> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpTemplate record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpTemplate record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
