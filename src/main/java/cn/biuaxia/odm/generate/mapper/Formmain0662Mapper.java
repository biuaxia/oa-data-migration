package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0662;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0662Mapper extends BaseMapper<Formmain0662> {
    int updateBatch(List<Formmain0662> list);

    int updateBatchSelective(List<Formmain0662> list);

    int batchInsert(@Param("list") List<Formmain0662> list);

    int insertOrUpdate(Formmain0662 record);

    int insertOrUpdateSelective(Formmain0662 record);
}