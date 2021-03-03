package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.biuaxia.odm.generate.domain.ColSummary;
import cn.biuaxia.odm.generate.mapper.ColSummaryMapper;
import cn.biuaxia.odm.generate.service.ColSummaryService;
@Service
public class ColSummaryServiceImpl extends ServiceImpl<ColSummaryMapper, ColSummary> implements ColSummaryService{

    @Override
    public int updateBatch(List<ColSummary> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<ColSummary> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<ColSummary> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(ColSummary record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(ColSummary record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
