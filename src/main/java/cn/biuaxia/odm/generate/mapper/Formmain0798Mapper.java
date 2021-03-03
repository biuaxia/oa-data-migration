package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0798;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0798Mapper extends BaseMapper<Formmain0798> {
    int updateBatch(List<Formmain0798> list);

    int updateBatchSelective(List<Formmain0798> list);

    int batchInsert(@Param("list") List<Formmain0798> list);

    int insertOrUpdate(Formmain0798 record);

    int insertOrUpdateSelective(Formmain0798 record);
}