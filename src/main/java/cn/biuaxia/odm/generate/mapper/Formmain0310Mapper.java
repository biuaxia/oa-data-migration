package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0310;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0310Mapper extends BaseMapper<Formmain0310> {
    int updateBatch(List<Formmain0310> list);

    int updateBatchSelective(List<Formmain0310> list);

    int batchInsert(@Param("list") List<Formmain0310> list);

    int insertOrUpdate(Formmain0310 record);

    int insertOrUpdateSelective(Formmain0310 record);
}