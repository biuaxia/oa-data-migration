package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.CtpFile;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

public interface CtpFileService extends IService<CtpFile> {


    int updateBatch(List<CtpFile> list);

    int updateBatchSelective(List<CtpFile> list);

    int batchInsert(List<CtpFile> list);

    int insertOrUpdate(CtpFile record);

    int insertOrUpdateSelective(CtpFile record);

}
