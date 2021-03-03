package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0802;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0802Mapper extends BaseMapper<Formmain0802> {
    int updateBatch(List<Formmain0802> list);

    int updateBatchSelective(List<Formmain0802> list);

    int batchInsert(@Param("list") List<Formmain0802> list);

    int insertOrUpdate(Formmain0802 record);

    int insertOrUpdateSelective(Formmain0802 record);
}