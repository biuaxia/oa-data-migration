package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0847;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0847Mapper extends BaseMapper<Formmain0847> {
    int updateBatch(List<Formmain0847> list);

    int updateBatchSelective(List<Formmain0847> list);

    int batchInsert(@Param("list") List<Formmain0847> list);

    int insertOrUpdate(Formmain0847 record);

    int insertOrUpdateSelective(Formmain0847 record);
}