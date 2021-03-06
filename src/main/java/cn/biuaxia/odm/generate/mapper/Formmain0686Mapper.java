package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0686;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0686Mapper extends BaseMapper<Formmain0686> {
    int updateBatch(List<Formmain0686> list);

    int updateBatchSelective(List<Formmain0686> list);

    int batchInsert(@Param("list") List<Formmain0686> list);

    int insertOrUpdate(Formmain0686 record);

    int insertOrUpdateSelective(Formmain0686 record);
}