package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0781;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0781Mapper extends BaseMapper<Formmain0781> {
    int updateBatch(List<Formmain0781> list);

    int updateBatchSelective(List<Formmain0781> list);

    int batchInsert(@Param("list") List<Formmain0781> list);

    int insertOrUpdate(Formmain0781 record);

    int insertOrUpdateSelective(Formmain0781 record);
}