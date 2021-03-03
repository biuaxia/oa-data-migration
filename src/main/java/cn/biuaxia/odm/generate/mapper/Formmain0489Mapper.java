package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0489;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0489Mapper extends BaseMapper<Formmain0489> {
    int updateBatch(List<Formmain0489> list);

    int updateBatchSelective(List<Formmain0489> list);

    int batchInsert(@Param("list") List<Formmain0489> list);

    int insertOrUpdate(Formmain0489 record);

    int insertOrUpdateSelective(Formmain0489 record);
}