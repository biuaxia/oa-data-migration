package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0531;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0531Mapper extends BaseMapper<Formmain0531> {
    int updateBatch(List<Formmain0531> list);

    int updateBatchSelective(List<Formmain0531> list);

    int batchInsert(@Param("list") List<Formmain0531> list);

    int insertOrUpdate(Formmain0531 record);

    int insertOrUpdateSelective(Formmain0531 record);
}