package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0725;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0725Mapper extends BaseMapper<Formmain0725> {
    int updateBatch(List<Formmain0725> list);

    int updateBatchSelective(List<Formmain0725> list);

    int batchInsert(@Param("list") List<Formmain0725> list);

    int insertOrUpdate(Formmain0725 record);

    int insertOrUpdateSelective(Formmain0725 record);
}