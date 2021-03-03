package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0801;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0801Mapper extends BaseMapper<Formmain0801> {
    int updateBatch(List<Formmain0801> list);

    int updateBatchSelective(List<Formmain0801> list);

    int batchInsert(@Param("list") List<Formmain0801> list);

    int insertOrUpdate(Formmain0801 record);

    int insertOrUpdateSelective(Formmain0801 record);
}