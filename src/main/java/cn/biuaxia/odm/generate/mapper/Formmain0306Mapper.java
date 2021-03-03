package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0306;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0306Mapper extends BaseMapper<Formmain0306> {
    int updateBatch(List<Formmain0306> list);

    int updateBatchSelective(List<Formmain0306> list);

    int batchInsert(@Param("list") List<Formmain0306> list);

    int insertOrUpdate(Formmain0306 record);

    int insertOrUpdateSelective(Formmain0306 record);
}