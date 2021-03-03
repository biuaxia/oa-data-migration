package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0813;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0813Mapper extends BaseMapper<Formmain0813> {
    int updateBatch(List<Formmain0813> list);

    int updateBatchSelective(List<Formmain0813> list);

    int batchInsert(@Param("list") List<Formmain0813> list);

    int insertOrUpdate(Formmain0813 record);

    int insertOrUpdateSelective(Formmain0813 record);
}