package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0758;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0758Mapper extends BaseMapper<Formmain0758> {
    int updateBatch(List<Formmain0758> list);

    int updateBatchSelective(List<Formmain0758> list);

    int batchInsert(@Param("list") List<Formmain0758> list);

    int insertOrUpdate(Formmain0758 record);

    int insertOrUpdateSelective(Formmain0758 record);
}