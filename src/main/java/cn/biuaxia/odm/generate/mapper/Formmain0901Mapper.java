package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0901;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0901Mapper extends BaseMapper<Formmain0901> {
    int updateBatch(List<Formmain0901> list);

    int updateBatchSelective(List<Formmain0901> list);

    int batchInsert(@Param("list") List<Formmain0901> list);

    int insertOrUpdate(Formmain0901 record);

    int insertOrUpdateSelective(Formmain0901 record);
}