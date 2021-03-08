package cn.biuaxia.data.migration.generate.msq.service.impl;

import cn.biuaxia.data.migration.generate.msq.domain.KmImissiveSendMain;
import cn.biuaxia.data.migration.generate.msq.mapper.KmImissiveSendMainMapper;
import cn.biuaxia.data.migration.generate.msq.service.KmImissiveSendMainService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("msq")
public class KmImissiveSendMainServiceImpl extends ServiceImpl<KmImissiveSendMainMapper, KmImissiveSendMain> implements KmImissiveSendMainService {

    @Override
    public int updateBatch(List<KmImissiveSendMain> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<KmImissiveSendMain> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<KmImissiveSendMain> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(KmImissiveSendMain record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(KmImissiveSendMain record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
