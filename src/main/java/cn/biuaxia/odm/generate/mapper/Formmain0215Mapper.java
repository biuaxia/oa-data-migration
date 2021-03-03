package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0215;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0215Mapper extends BaseMapper<Formmain0215> {
    int updateBatch(List<Formmain0215> list);

    int updateBatchSelective(List<Formmain0215> list);

    int batchInsert(@Param("list") List<Formmain0215> list);

    int insertOrUpdate(Formmain0215 record);

    int insertOrUpdateSelective(Formmain0215 record);
}