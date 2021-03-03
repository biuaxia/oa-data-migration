package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0754;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0754Mapper extends BaseMapper<Formmain0754> {
    int updateBatch(List<Formmain0754> list);

    int updateBatchSelective(List<Formmain0754> list);

    int batchInsert(@Param("list") List<Formmain0754> list);

    int insertOrUpdate(Formmain0754 record);

    int insertOrUpdateSelective(Formmain0754 record);
}