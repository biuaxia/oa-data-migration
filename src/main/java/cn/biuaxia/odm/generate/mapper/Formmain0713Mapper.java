package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0713;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0713Mapper extends BaseMapper<Formmain0713> {
    int updateBatch(List<Formmain0713> list);

    int updateBatchSelective(List<Formmain0713> list);

    int batchInsert(@Param("list") List<Formmain0713> list);

    int insertOrUpdate(Formmain0713 record);

    int insertOrUpdateSelective(Formmain0713 record);
}