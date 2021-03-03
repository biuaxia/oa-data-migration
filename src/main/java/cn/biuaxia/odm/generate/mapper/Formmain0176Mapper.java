package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0176;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0176Mapper extends BaseMapper<Formmain0176> {
    int updateBatch(List<Formmain0176> list);

    int updateBatchSelective(List<Formmain0176> list);

    int batchInsert(@Param("list") List<Formmain0176> list);

    int insertOrUpdate(Formmain0176 record);

    int insertOrUpdateSelective(Formmain0176 record);
}