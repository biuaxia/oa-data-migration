package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0718;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0718Mapper extends BaseMapper<Formmain0718> {
    int updateBatch(List<Formmain0718> list);

    int updateBatchSelective(List<Formmain0718> list);

    int batchInsert(@Param("list") List<Formmain0718> list);

    int insertOrUpdate(Formmain0718 record);

    int insertOrUpdateSelective(Formmain0718 record);
}