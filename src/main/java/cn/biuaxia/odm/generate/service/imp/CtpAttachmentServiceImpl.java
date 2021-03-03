package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.List;

import cn.biuaxia.odm.generate.domain.CtpAttachment;
import cn.biuaxia.odm.generate.mapper.CtpAttachmentMapper;
import cn.biuaxia.odm.generate.service.CtpAttachmentService;

@Service
public class CtpAttachmentServiceImpl extends ServiceImpl<CtpAttachmentMapper, CtpAttachment> implements CtpAttachmentService {

    @Override
    public int updateBatch(List<CtpAttachment> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpAttachment> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpAttachment> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpAttachment record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpAttachment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
