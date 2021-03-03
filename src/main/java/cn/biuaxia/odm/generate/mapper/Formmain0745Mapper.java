package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0745;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0745Mapper extends BaseMapper<Formmain0745> {
    int updateBatch(List<Formmain0745> list);

    int updateBatchSelective(List<Formmain0745> list);

    int batchInsert(@Param("list") List<Formmain0745> list);

    int insertOrUpdate(Formmain0745 record);

    int insertOrUpdateSelective(Formmain0745 record);
}