package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0862;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0862Mapper extends BaseMapper<Formmain0862> {
    int updateBatch(List<Formmain0862> list);

    int updateBatchSelective(List<Formmain0862> list);

    int batchInsert(@Param("list") List<Formmain0862> list);

    int insertOrUpdate(Formmain0862 record);

    int insertOrUpdateSelective(Formmain0862 record);
}