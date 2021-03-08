package cn.biuaxia.data.migration.generate.orcl.service.impl;

import cn.biuaxia.data.migration.generate.orcl.domain.MvFormsetInst;
import cn.biuaxia.data.migration.generate.orcl.mapper.MvFormsetInstMapper;
import cn.biuaxia.data.migration.generate.orcl.service.MvFormsetInstService;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@DS("orcl")
public class MvFormsetInstServiceImpl extends ServiceImpl<MvFormsetInstMapper, MvFormsetInst> implements MvFormsetInstService {

    @Override
    public int updateBatch(List<MvFormsetInst> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<MvFormsetInst> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<MvFormsetInst> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(MvFormsetInst record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(MvFormsetInst record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
