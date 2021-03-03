package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.FormResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FormResourceMapper extends BaseMapper<FormResource> {
    int updateBatch(List<FormResource> list);

    int updateBatchSelective(List<FormResource> list);

    int batchInsert(@Param("list") List<FormResource> list);

    int insertOrUpdate(FormResource record);

    int insertOrUpdateSelective(FormResource record);
}