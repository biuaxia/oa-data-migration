package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0741;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0741Mapper extends BaseMapper<Formmain0741> {
    int updateBatch(List<Formmain0741> list);

    int updateBatchSelective(List<Formmain0741> list);

    int batchInsert(@Param("list") List<Formmain0741> list);

    int insertOrUpdate(Formmain0741 record);

    int insertOrUpdateSelective(Formmain0741 record);
}