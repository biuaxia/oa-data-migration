package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.domain.CtpFile;

import java.util.List;

import cn.biuaxia.odm.generate.mapper.CtpFileMapper;
import cn.biuaxia.odm.generate.service.CtpFileService;

@Service
public class CtpFileServiceImpl extends ServiceImpl<CtpFileMapper, CtpFile> implements CtpFileService {

    @Override
    public int updateBatch(List<CtpFile> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<CtpFile> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<CtpFile> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(CtpFile record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(CtpFile record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
