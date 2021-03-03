package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0591;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0591Mapper extends BaseMapper<Formmain0591> {
    int updateBatch(List<Formmain0591> list);

    int updateBatchSelective(List<Formmain0591> list);

    int batchInsert(@Param("list") List<Formmain0591> list);

    int insertOrUpdate(Formmain0591 record);

    int insertOrUpdateSelective(Formmain0591 record);
}