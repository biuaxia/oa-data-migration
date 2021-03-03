package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0488;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0488Mapper extends BaseMapper<Formmain0488> {
    int updateBatch(List<Formmain0488> list);

    int updateBatchSelective(List<Formmain0488> list);

    int batchInsert(@Param("list") List<Formmain0488> list);

    int insertOrUpdate(Formmain0488 record);

    int insertOrUpdateSelective(Formmain0488 record);
}