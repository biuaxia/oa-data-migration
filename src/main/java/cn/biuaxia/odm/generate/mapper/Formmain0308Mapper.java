package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0308;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0308Mapper extends BaseMapper<Formmain0308> {
    int updateBatch(List<Formmain0308> list);

    int updateBatchSelective(List<Formmain0308> list);

    int batchInsert(@Param("list") List<Formmain0308> list);

    int insertOrUpdate(Formmain0308 record);

    int insertOrUpdateSelective(Formmain0308 record);
}