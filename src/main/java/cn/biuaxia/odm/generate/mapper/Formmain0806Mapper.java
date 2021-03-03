package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0806;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0806Mapper extends BaseMapper<Formmain0806> {
    int updateBatch(List<Formmain0806> list);

    int updateBatchSelective(List<Formmain0806> list);

    int batchInsert(@Param("list") List<Formmain0806> list);

    int insertOrUpdate(Formmain0806 record);

    int insertOrUpdateSelective(Formmain0806 record);
}