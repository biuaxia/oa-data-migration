package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0774;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0774Mapper extends BaseMapper<Formmain0774> {
    int updateBatch(List<Formmain0774> list);

    int updateBatchSelective(List<Formmain0774> list);

    int batchInsert(@Param("list") List<Formmain0774> list);

    int insertOrUpdate(Formmain0774 record);

    int insertOrUpdateSelective(Formmain0774 record);
}