package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.FormDefinition;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FormDefinitionMapper extends BaseMapper<FormDefinition> {
    int updateBatch(List<FormDefinition> list);

    int updateBatchSelective(List<FormDefinition> list);

    int batchInsert(@Param("list") List<FormDefinition> list);

    int insertOrUpdate(FormDefinition record);

    int insertOrUpdateSelective(FormDefinition record);
}