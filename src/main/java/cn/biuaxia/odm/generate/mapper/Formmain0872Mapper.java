package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0872;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0872Mapper extends BaseMapper<Formmain0872> {
    int updateBatch(List<Formmain0872> list);

    int updateBatchSelective(List<Formmain0872> list);

    int batchInsert(@Param("list") List<Formmain0872> list);

    int insertOrUpdate(Formmain0872 record);

    int insertOrUpdateSelective(Formmain0872 record);
}