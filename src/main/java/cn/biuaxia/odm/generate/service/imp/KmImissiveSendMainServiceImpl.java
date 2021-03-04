package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.KmImissiveSendMainMapper;
import java.util.List;
import cn.biuaxia.odm.generate.domain.KmImissiveSendMain;
import cn.biuaxia.odm.generate.service.KmImissiveSendMainService;
@Service
public class KmImissiveSendMainServiceImpl extends ServiceImpl<KmImissiveSendMainMapper, KmImissiveSendMain> implements KmImissiveSendMainService{

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
