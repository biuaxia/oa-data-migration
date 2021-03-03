package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0533;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0533Mapper extends BaseMapper<Formmain0533> {
    int updateBatch(List<Formmain0533> list);

    int updateBatchSelective(List<Formmain0533> list);

    int batchInsert(@Param("list") List<Formmain0533> list);

    int insertOrUpdate(Formmain0533 record);

    int insertOrUpdateSelective(Formmain0533 record);
}