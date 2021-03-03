package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0782;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0782Mapper extends BaseMapper<Formmain0782> {
    int updateBatch(List<Formmain0782> list);

    int updateBatchSelective(List<Formmain0782> list);

    int batchInsert(@Param("list") List<Formmain0782> list);

    int insertOrUpdate(Formmain0782 record);

    int insertOrUpdateSelective(Formmain0782 record);
}