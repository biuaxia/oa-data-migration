package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0870;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0870Mapper extends BaseMapper<Formmain0870> {
    int updateBatch(List<Formmain0870> list);

    int updateBatchSelective(List<Formmain0870> list);

    int batchInsert(@Param("list") List<Formmain0870> list);

    int insertOrUpdate(Formmain0870 record);

    int insertOrUpdateSelective(Formmain0870 record);
}