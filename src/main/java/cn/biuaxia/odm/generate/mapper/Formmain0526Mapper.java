package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0526;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0526Mapper extends BaseMapper<Formmain0526> {
    int updateBatch(List<Formmain0526> list);

    int updateBatchSelective(List<Formmain0526> list);

    int batchInsert(@Param("list") List<Formmain0526> list);

    int insertOrUpdate(Formmain0526 record);

    int insertOrUpdateSelective(Formmain0526 record);
}