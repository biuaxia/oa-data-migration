package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0784;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0784Mapper extends BaseMapper<Formmain0784> {
    int updateBatch(List<Formmain0784> list);

    int updateBatchSelective(List<Formmain0784> list);

    int batchInsert(@Param("list") List<Formmain0784> list);

    int insertOrUpdate(Formmain0784 record);

    int insertOrUpdateSelective(Formmain0784 record);
}