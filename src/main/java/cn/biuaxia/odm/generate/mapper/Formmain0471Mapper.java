package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0471;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0471Mapper extends BaseMapper<Formmain0471> {
    int updateBatch(List<Formmain0471> list);

    int updateBatchSelective(List<Formmain0471> list);

    int batchInsert(@Param("list") List<Formmain0471> list);

    int insertOrUpdate(Formmain0471 record);

    int insertOrUpdateSelective(Formmain0471 record);
}