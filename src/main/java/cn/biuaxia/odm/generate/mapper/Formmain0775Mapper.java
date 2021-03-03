package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0775;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0775Mapper extends BaseMapper<Formmain0775> {
    int updateBatch(List<Formmain0775> list);

    int updateBatchSelective(List<Formmain0775> list);

    int batchInsert(@Param("list") List<Formmain0775> list);

    int insertOrUpdate(Formmain0775 record);

    int insertOrUpdateSelective(Formmain0775 record);
}