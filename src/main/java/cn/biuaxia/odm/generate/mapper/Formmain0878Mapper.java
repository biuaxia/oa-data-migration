package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0878;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0878Mapper extends BaseMapper<Formmain0878> {
    int updateBatch(List<Formmain0878> list);

    int updateBatchSelective(List<Formmain0878> list);

    int batchInsert(@Param("list") List<Formmain0878> list);

    int insertOrUpdate(Formmain0878 record);

    int insertOrUpdateSelective(Formmain0878 record);
}