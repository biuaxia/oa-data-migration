package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0854;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0854Mapper extends BaseMapper<Formmain0854> {
    int updateBatch(List<Formmain0854> list);

    int updateBatchSelective(List<Formmain0854> list);

    int batchInsert(@Param("list") List<Formmain0854> list);

    int insertOrUpdate(Formmain0854 record);

    int insertOrUpdateSelective(Formmain0854 record);
}