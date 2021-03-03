package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.EdocSummary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EdocSummaryMapper extends BaseMapper<EdocSummary> {
    int updateBatch(List<EdocSummary> list);

    int updateBatchSelective(List<EdocSummary> list);

    int batchInsert(@Param("list") List<EdocSummary> list);

    int insertOrUpdate(EdocSummary record);

    int insertOrUpdateSelective(EdocSummary record);
}