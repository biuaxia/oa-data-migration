package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.biuaxia.odm.generate.domain.KmImissiveReceiveMain;
import cn.biuaxia.odm.generate.mapper.KmImissiveReceiveMainMapper;
import cn.biuaxia.odm.generate.service.KmImissiveReceiveMainService;
@Service
public class KmImissiveReceiveMainServiceImpl extends ServiceImpl<KmImissiveReceiveMainMapper, KmImissiveReceiveMain> implements KmImissiveReceiveMainService{

    @Override
    public int updateBatch(List<KmImissiveReceiveMain> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<KmImissiveReceiveMain> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<KmImissiveReceiveMain> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(KmImissiveReceiveMain record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(KmImissiveReceiveMain record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
