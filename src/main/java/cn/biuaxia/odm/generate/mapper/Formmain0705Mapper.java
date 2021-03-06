package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0705;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0705Mapper extends BaseMapper<Formmain0705> {
    int updateBatch(List<Formmain0705> list);

    int updateBatchSelective(List<Formmain0705> list);

    int batchInsert(@Param("list") List<Formmain0705> list);

    int insertOrUpdate(Formmain0705 record);

    int insertOrUpdateSelective(Formmain0705 record);
}