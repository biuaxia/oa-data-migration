package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0302;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0302Mapper extends BaseMapper<Formmain0302> {
    int updateBatch(List<Formmain0302> list);

    int updateBatchSelective(List<Formmain0302> list);

    int batchInsert(@Param("list") List<Formmain0302> list);

    int insertOrUpdate(Formmain0302 record);

    int insertOrUpdateSelective(Formmain0302 record);
}