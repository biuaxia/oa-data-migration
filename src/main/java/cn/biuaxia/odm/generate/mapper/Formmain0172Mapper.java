package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0172;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0172Mapper extends BaseMapper<Formmain0172> {
    int updateBatch(List<Formmain0172> list);

    int updateBatchSelective(List<Formmain0172> list);

    int batchInsert(@Param("list") List<Formmain0172> list);

    int insertOrUpdate(Formmain0172 record);

    int insertOrUpdateSelective(Formmain0172 record);
}