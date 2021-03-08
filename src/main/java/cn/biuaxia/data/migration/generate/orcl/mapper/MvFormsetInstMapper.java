package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.MvFormsetInst;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MvFormsetInstMapper extends BaseMapper<MvFormsetInst> {
    int updateBatch(List<MvFormsetInst> list);

    int updateBatchSelective(List<MvFormsetInst> list);

    int batchInsert(@Param("list") List<MvFormsetInst> list);

    int insertOrUpdate(MvFormsetInst record);

    int insertOrUpdateSelective(MvFormsetInst record);
}