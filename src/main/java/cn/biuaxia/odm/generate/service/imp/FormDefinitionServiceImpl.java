package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.biuaxia.odm.generate.mapper.FormDefinitionMapper;
import cn.biuaxia.odm.generate.domain.FormDefinition;
import cn.biuaxia.odm.generate.service.FormDefinitionService;
@Service
public class FormDefinitionServiceImpl extends ServiceImpl<FormDefinitionMapper, FormDefinition> implements FormDefinitionService{

    @Override
    public int updateBatch(List<FormDefinition> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<FormDefinition> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<FormDefinition> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(FormDefinition record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(FormDefinition record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
