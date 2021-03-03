package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0731;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0731Mapper extends BaseMapper<Formmain0731> {
    int updateBatch(List<Formmain0731> list);

    int updateBatchSelective(List<Formmain0731> list);

    int batchInsert(@Param("list") List<Formmain0731> list);

    int insertOrUpdate(Formmain0731 record);

    int insertOrUpdateSelective(Formmain0731 record);
}