package cn.biuaxia.data.migration.generate.orcl.service;

import cn.biuaxia.data.migration.generate.orcl.domain.MvFormsetInst;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface MvFormsetInstService extends IService<MvFormsetInst> {


    int updateBatch(List<MvFormsetInst> list);

    int updateBatchSelective(List<MvFormsetInst> list);

    int batchInsert(List<MvFormsetInst> list);

    int insertOrUpdate(MvFormsetInst record);

    int insertOrUpdateSelective(MvFormsetInst record);

}
