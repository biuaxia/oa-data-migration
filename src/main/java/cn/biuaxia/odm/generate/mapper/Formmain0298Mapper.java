package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0298;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0298Mapper extends BaseMapper<Formmain0298> {
    int updateBatch(List<Formmain0298> list);

    int updateBatchSelective(List<Formmain0298> list);

    int batchInsert(@Param("list") List<Formmain0298> list);

    int insertOrUpdate(Formmain0298 record);

    int insertOrUpdateSelective(Formmain0298 record);
}