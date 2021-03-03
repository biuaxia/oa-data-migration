package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0496;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0496Mapper extends BaseMapper<Formmain0496> {
    int updateBatch(List<Formmain0496> list);

    int updateBatchSelective(List<Formmain0496> list);

    int batchInsert(@Param("list") List<Formmain0496> list);

    int insertOrUpdate(Formmain0496 record);

    int insertOrUpdateSelective(Formmain0496 record);
}