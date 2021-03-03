package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0741;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0741Mapper extends BaseMapper<Formmain0741> {
    int updateBatch(List<Formmain0741> list);

    int updateBatchSelective(List<Formmain0741> list);

    int batchInsert(@Param("list") List<Formmain0741> list);

    int insertOrUpdate(Formmain0741 record);

    int insertOrUpdateSelective(Formmain0741 record);
}