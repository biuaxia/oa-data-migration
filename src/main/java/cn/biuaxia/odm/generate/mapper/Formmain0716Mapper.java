package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0716;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0716Mapper extends BaseMapper<Formmain0716> {
    int updateBatch(List<Formmain0716> list);

    int updateBatchSelective(List<Formmain0716> list);

    int batchInsert(@Param("list") List<Formmain0716> list);

    int insertOrUpdate(Formmain0716 record);

    int insertOrUpdateSelective(Formmain0716 record);
}