package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0898;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0898Mapper extends BaseMapper<Formmain0898> {
    int updateBatch(List<Formmain0898> list);

    int updateBatchSelective(List<Formmain0898> list);

    int batchInsert(@Param("list") List<Formmain0898> list);

    int insertOrUpdate(Formmain0898 record);

    int insertOrUpdateSelective(Formmain0898 record);
}