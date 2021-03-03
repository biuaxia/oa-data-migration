package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.ColSummary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ColSummaryMapper extends BaseMapper<ColSummary> {
    int updateBatch(List<ColSummary> list);

    int updateBatchSelective(List<ColSummary> list);

    int batchInsert(@Param("list") List<ColSummary> list);

    int insertOrUpdate(ColSummary record);

    int insertOrUpdateSelective(ColSummary record);
}