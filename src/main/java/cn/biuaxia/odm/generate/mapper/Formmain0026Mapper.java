package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0026;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0026Mapper extends BaseMapper<Formmain0026> {
    int updateBatch(List<Formmain0026> list);

    int updateBatchSelective(List<Formmain0026> list);

    int batchInsert(@Param("list") List<Formmain0026> list);

    int insertOrUpdate(Formmain0026 record);

    int insertOrUpdateSelective(Formmain0026 record);
}