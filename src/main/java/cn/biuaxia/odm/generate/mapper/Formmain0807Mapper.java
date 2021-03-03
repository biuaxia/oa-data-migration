package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0807;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0807Mapper extends BaseMapper<Formmain0807> {
    int updateBatch(List<Formmain0807> list);

    int updateBatchSelective(List<Formmain0807> list);

    int batchInsert(@Param("list") List<Formmain0807> list);

    int insertOrUpdate(Formmain0807 record);

    int insertOrUpdateSelective(Formmain0807 record);
}