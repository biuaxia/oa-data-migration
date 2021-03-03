package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0221;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0221Mapper extends BaseMapper<Formmain0221> {
    int updateBatch(List<Formmain0221> list);

    int updateBatchSelective(List<Formmain0221> list);

    int batchInsert(@Param("list") List<Formmain0221> list);

    int insertOrUpdate(Formmain0221 record);

    int insertOrUpdateSelective(Formmain0221 record);
}