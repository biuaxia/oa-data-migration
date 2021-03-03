package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0803;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0803Mapper extends BaseMapper<Formmain0803> {
    int updateBatch(List<Formmain0803> list);

    int updateBatchSelective(List<Formmain0803> list);

    int batchInsert(@Param("list") List<Formmain0803> list);

    int insertOrUpdate(Formmain0803 record);

    int insertOrUpdateSelective(Formmain0803 record);
}