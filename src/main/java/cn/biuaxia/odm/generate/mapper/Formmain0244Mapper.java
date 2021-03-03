package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0244;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0244Mapper extends BaseMapper<Formmain0244> {
    int updateBatch(List<Formmain0244> list);

    int updateBatchSelective(List<Formmain0244> list);

    int batchInsert(@Param("list") List<Formmain0244> list);

    int insertOrUpdate(Formmain0244 record);

    int insertOrUpdateSelective(Formmain0244 record);
}