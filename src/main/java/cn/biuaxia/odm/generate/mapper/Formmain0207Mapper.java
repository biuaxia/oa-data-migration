package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0207;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0207Mapper extends BaseMapper<Formmain0207> {
    int updateBatch(List<Formmain0207> list);

    int updateBatchSelective(List<Formmain0207> list);

    int batchInsert(@Param("list") List<Formmain0207> list);

    int insertOrUpdate(Formmain0207 record);

    int insertOrUpdateSelective(Formmain0207 record);
}