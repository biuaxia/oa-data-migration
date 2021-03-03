package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpTemplate;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CtpTemplateMapper extends BaseMapper<CtpTemplate> {
    int updateBatch(List<CtpTemplate> list);

    int updateBatchSelective(List<CtpTemplate> list);

    int batchInsert(@Param("list") List<CtpTemplate> list);

    int insertOrUpdate(CtpTemplate record);

    int insertOrUpdateSelective(CtpTemplate record);
}