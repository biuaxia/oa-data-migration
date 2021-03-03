package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0286;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0286Mapper extends BaseMapper<Formmain0286> {
    int updateBatch(List<Formmain0286> list);

    int updateBatchSelective(List<Formmain0286> list);

    int batchInsert(@Param("list") List<Formmain0286> list);

    int insertOrUpdate(Formmain0286 record);

    int insertOrUpdateSelective(Formmain0286 record);
}