package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0661;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0661Mapper extends BaseMapper<Formmain0661> {
    int updateBatch(List<Formmain0661> list);

    int updateBatchSelective(List<Formmain0661> list);

    int batchInsert(@Param("list") List<Formmain0661> list);

    int insertOrUpdate(Formmain0661 record);

    int insertOrUpdateSelective(Formmain0661 record);
}