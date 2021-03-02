package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.EdocSummary;
import java.util.List;
import cn.biuaxia.odm.generate.mapper.EdocSummaryMapper;
import cn.biuaxia.odm.generate.service.EdocSummaryService;
@Service
public class EdocSummaryServiceImpl extends ServiceImpl<EdocSummaryMapper, EdocSummary> implements EdocSummaryService{

    @Override
    public int updateBatch(List<EdocSummary> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<EdocSummary> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<EdocSummary> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(EdocSummary record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(EdocSummary record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
